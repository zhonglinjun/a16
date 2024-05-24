<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>jquery</title>
	<script src="<%=request.getContextPath()%>/js/jquery-3.7.0.js"></script>
</head>
<script type="text/javascript">
	//这里面是写javascript代码的，也是jquery代码
	//jquery是封装了javascript的高级一点技术 
	// $代表的是 jQuery这几个字母 
	/**
		jquery选择器（与css相同）
		1，.表示是class的值
		2，#表示是id的值
		3，直接用标签名选择 
	*/
	$(function (){ //页面自动会加载调用的程序块
		alert("显示文字"); 
	
		aa(); //函数是要调用了才执行的 
		function aa(){
			alert("函数 。。。 ");
		}
		
		$("#butId").click(function(){ //为id的值是butId的按钮绑定一个事件，这个事件是click（点击事件）
			var vv = $("#nuId").val();//取值
			alert(vv); //打出来看看 
		}); 
		$("#butId2").click(function(){
			var vv = $("#nuId").val(); //取值
			 $("#nuId2").val(vv); //放值
		}); 
		
		$("#fbtId").click(function(){
			var vv = $("#fontId").text();//取值
			alert(vv); //打出来看看 
		}); 
		$("#fbtId2").click(function(){
			var vv = $("#fontId").text();//取值
			$("#fontId2").text(vv);//放值
		}); 
		
		//找到form标签下的所有的input标签 
		function findsss(){
			var ff = $("form").find("input");
			//console.log(ff.length);
			for (var i=0;i<ff.length;i++){
				alert(ff[i].value);
			}
		}
		$("#an5").click(function(){
			findsss();	
		}); 
	});

</script>
<body> 
	账户：<input type="text" name="nu" id="nuId" /> <br />
	<button id="butId">按钮</button> <br />
	
	账户2：<input type="text" name="nu2" id="nuId2" /> <br />
	<button id="butId2">按钮2</button> <br />
	
	<font id="fontId">张三是一个疯子</font>
	<button id="fbtId">按钮3</button> <br /><br /><br />
	
	<button id="fbtId2">按钮4</button> <br /> 
	<font id="fontId2"></font><br />
	
	<form>
		<input type="text" name="pp" id="ppId" /> <br />
		<div>
			<input type="text" name="xx" id="xxId" /> <br />
		</div> 
		<input type="button"  id="an5" value="按钮5" />
	</form>
</body>
</html>