(function($) {
	var ajax = $.ajax;
	$.extend({
				createLoading : function() {
					var html = "<div id=\"__loadimg\" style='height:100%;width:100%;background:#ccc;opacity:0.4;filter:alpha(opacity=30);left:0;top:0;align:center;"
							+ " overflow:hidden; position:absolute;z-index:9999'>"
							+ " <div style='position: absolute; top: 50%;left:50%'>"
							+ " <div style=\"border:2px solid #6593CF;color:#222;font-size:12px;padding:12px 5px 10px 30px;cursor:wait; "
							+ " background:#fff url('"
							+ $.contextPath
							+ "/resources/images/pic/loading.gif') no-repeat scroll 5px 10px; "
							+ " position: relative;top: -50%;left: -50%;"
							+ " margin: 0 auto;width:180px; height:16px;\">正在处理中,请稍后。。。</div></div></div>";
					$("body").append(html);
				},
				clearLoading : function(){
					$("#__loadimg").remove();
				},
				ajax : function(param) {
					var loadMsg = typeof param.loadMsg !== 'undefined' ? param.loadMsg : false;
					if (loadMsg) {
						this.createLoading();
					}
					$("#__loadimg").ajaxStart(function() {
						$(this).show();
					});
					ajax({
						type : param.type || 'GET',
						url : param.url || null,
						dataType : param.dataType || null,
						data : param.data || {},
						async : typeof (param.async) !== 'undefined' ? param.async : true,
						context : param.context || null,
						complete : param.complete || function(jqXHR, textStatus) {
							$("#__loadimg").remove();
						},
						success : param.success || function() {
							$("#__loadimg").remove();
						},
						error : param.error || function(xhr, status, errMsg) {
							var errHeader, errHeaderMsg, errJson, code;
							try {
								errHeader = xhr.errorHeader || "Error-Json";
								errHeaderMsg = xhr.getResponseHeader(errHeader);
							} catch (e) {
								errHeaderMsg = null;
							}
							if (errHeaderMsg && errHeaderMsg !== "") {
								errJson = decodeURIComponent(errHeaderMsg);
								errMsg = eval("(" + errJson + ")");
								code = errMsg.code;
								$.messager.alert('错误提示', errMsg.msg, 'error');
							}
						}
					});
					$("#__loadimg").ajaxStop(function() {
						$(this).remove();
					});
				}
			});

	$.extend({
		formToJson : function(element) {
			var json = {}, obj;
			obj = (typeof element === 'string') ? (element.indexOf("#") === -1 ? $("#" + element) : $(element)) : element;
			obj.find("input,select,textarea").each(function(index, o) {
				switch (o.tagName) {
				case "INPUT":
					switch (o.type.toLowerCase()) {
					case "radio":
						if (o.checked === true) {
							json[o.name] = $.trim(o.value);
						}
						break;
					case "checkbox":
						if (o.checked === true) {
							json[o.name] = $.trim(o.value);
						}
						break;
					default:
						json[o.id] = $.trim(o.value);
						break;
					}
					break;
				default:
					json[o.id] = $.trim(o.value);
					break;
				}
			});
			return json;
		},
		
		bindForm : function(element, attributes, prefix) {
			var key, prefix = prefix || "";
			element = element.indexOf("#") === -1 ? "#" + element : element;
			$(element).find("input,select,textarea").each(
					function(index, o) {
						for (key in attributes) {
							if (attributes.hasOwnProperty(key)) {	
								if (prefix + key === o.id || prefix + key === o.name) {
									var value = attributes[key];
									value = (null === value) ? "" : $.trim(value);
									switch (o.tagName.toLowerCase()) {
									case "input":
										switch (o.type.toLowerCase()) {
										case "radio":
											$(':radio[name=' + o.name + '][value=' + value + ']', element).attr(
													"checked", true);
											break;
										case "checkbox":
											$(':checkbox[name=' + o.name + '][value=' + value + ']', element)
													.attr("checked", true);
											break;
										case "file":
											$("#" + prefix + key, element).html(value);
											break;
										default:
											$("#" + prefix + key, element).val(value);
											break;
										}
										break;
									case "select":
										$("#" + prefix + key, element).val(value);
										break;
									default:
										$("#" + prefix + key, element).val(value);
										break;
									}
									break;
								}
							}
						}
					});
		},
		clearForm : function(element) {
			element = element.indexOf("#") === -1 ? "#" + element : element;
			$(element).find("input,select,textarea").each(function(index, o) {
				switch (o.tagName) {
				case "INPUT":
					switch (o.type.toLowerCase()) {
					case "radio":
						$(':radio[name=' + o.name + ']', element).attr("checked", false);
						break;
					case "checkbox":
						$(':checkbox[name=' + o.name + ']', element).attr("checked", false);
						break;
					default:
						$('#' + o.id, element).val("");
						break;
					}
					break;
				case "SELECT":
					$('#' + o.id, element).val("");
					break;
				default:
					$('#' + o.id, element).val("");
					break;
				}
			});
		},
		//exclude hidden and disabled and element
		clearAvaiableElements : function(element) {
			element = element.indexOf("#") === -1 ? "#" + element : element;
			$(element).find("input:not(:disabled,:hidden),select:not(:disabled,:hidden),textarea:not(:disabled,:hidden)").each(function(index, o) {
				switch (o.tagName) {
				case "INPUT":
					switch (o.type.toLowerCase()) {
					case "radio":
						$(':radio[name=' + o.name + ']', element).attr("checked", false);
						break;
					case "checkbox":
						$(':checkbox[name=' + o.name + ']', element).attr("checked", false);
						break;
					default:
						$('#' + o.id, element).val("");
						break;
					}
					break;
				case "SELECT":
					$('#' + o.id, element).val("");
					break;
				default:
					$('#' + o.id, element).val("");
					break;
				}
			});
		},
		serializeElement2String : function(obj) {
			var data = $.formToJson(obj);
			var param = [];
			for ( var key in data) {
				if (!$.isBlank(data[key])) {
					param.push(key + "=" + data[key] + "");
				}
			}
			return param.join("&");
		}
	});
	$.extend({
		includePath : '',
		include : function(file) {
			var files, name, att, ext, isCSS, tag, attr, link, i;
			files = typeof file === "string" ? [ file ] : file;
			for (i = 0; i < files.length; i += 1) {
				name = files[i].replace(/^\s|\s$/g, "");
				att = name.split('.');
				ext = att[att.length - 1].toLowerCase();
				isCSS = ext === "css";
				tag = isCSS ? "link" : "script";
				attr = isCSS ? " type='text/css' rel='stylesheet' " : " language='javascript' type='text/javascript' ";
				link = (isCSS ? "href" : "src") + "='" + $.includePath + name + "'";
				if ($(tag + "[" + link + "]").length === 0) {
					document.write("<" + tag + attr + link + "></" + tag + ">");
				}
			}
		}
	});
})(jQuery);