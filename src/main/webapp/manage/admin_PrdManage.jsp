<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 作品管理 -->
<%@ include file="menu.jsp" %>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="admin_index.jsp">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">商品管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="#" method="post">
                    <table class="search-tab">
                        <tr>
                            <th width="120">选择分类:</th>
                            <td>
                                <select name="search-sort" id="">
                                    <option value="">全部</option>
                                    <option value="19">精品界面</option><option value="20">推荐界面</option>
                                </select>
                            </td>
                            <th width="70">关键字:</th>
                            <td><input class="common-text" placeholder="关键字" name="keywords" value="" id="" type="text"></td>
                            <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="result-wrap">
            <form name="myform" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="manage/admin_PrdInsert.jsp"><i class="icon-font"></i>新增商品</a>
                        <a id="batchDel" href="javascript:void(0)"><i class="icon-font"></i>批量删除</a>
                        <a id="updateOrd" href="javascript:void(0)"><i class="icon-font"></i>更新排序</a>
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                        <tr>
                            <th class="tc" width="5%"><input class="allChoose" name="" type="checkbox"></th>
                            <th>商品ID</th>
                            <th>商品名</th>
                            <th>商品类别</th>
                            <th>商品价格</th>
                            <th>商品存量</th>
                            <th>商品图片相对路径</th>
                            <th>操作</th>
                        </tr>
                       
                        	<c:forEach items="${requestScope.produceList}" var="produce" >
                        	<tr>
                        	<td class="tc"><input name="id[]" value="59" type="checkbox"></td>
                            <td>${produce.prd_id}</td>
                            <td>${produce.prd_name}</td>
                            <td>${produce.prd_class}</td>
                            <td>${produce.prd_price}</td>
                            <td>${produce.prd_stockQty}</td>
                            <td>${produce.prd_path}</td>
                            <td>
                                <a class="link-update" href="#">修改</a>
                                <a class="link-del" href="#">删除</a>
                            </td>
                            </tr>
                          </c:forEach>
                        	
                    </table>
                    <div class="list-page">
                                                共${tsum}条记录  当前${cpage}/${tpage}页
                      <a href="Manage/ProduceServlet?method=getAllProduce&cp=1">首页</a>
                      <a href="Manage/ProduceServlet?method=getAllProduce&cp=${cpage-1>0? cpage-1:cpage}">上一页</a>
                      <a href="Manage/ProduceServlet?method=getAllProduce&cp=${cpage+1>tpage? cpage:cpage+1}">下一页</a>
                      <a href="Manage/ProduceServlet?method=getAllProduce&cp=${tpage}">未页</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!--/main-->
</body>
</html>