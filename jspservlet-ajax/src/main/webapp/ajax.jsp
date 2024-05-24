<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>ajax</title>
	<script src="<%=request.getContextPath()%>/js/jquery-3.7.0.js"></script>
</head>

<script type="text/javascript">
	//来了就去调servlet也就是java后台代码
	$(function (){ //自动执行的代码 
		
		query(); //调名叫query的函数 
		
		function query(){ //query函数
			$.ajax({ // ajax 
 				url:"<%=request.getContextPath()%>/testajax",
			  	type:"get", 
		  		data:{"a":1},
			  	dataType:"json",
			  	success:function(data){  // {"mark":"成功","stateCode":1111}
			  		alert("后台servlet返回来的数据是："+data.mark+"  , "+data.stateCode);
			  		
		  		}, 
		  		error:function(a,b,c) {
					  console.log("请求失败",a,b,c);
					  alert("ajax出错了，是服务器内部错误！");
			  	}	
		  	});
		}
	});
</script>

</body>
</html>