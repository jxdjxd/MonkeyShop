<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 新增商品页 -->
<%@ include file="menu.jsp" %>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="/MonkeyShop/manage/admin_design.jsp">首页</a><span class="crumb-step">&gt;</span><a class="crumb-name" href="/jscss/admin/design/">商品管理</a><span class="crumb-step">&gt;</span><span>新增商品</span></div>
        </div>
        <div class="result-wrap">
            <div class="result-content">
            <!-- enctype="multipart/form-data -->
                <form action="Manage/ProduceServlet?method=addProduce" method="post" id="myform" name="myform"">
                    <table class="insert-tab" width="100%">
                        <tbody>
                        <tr>
                                <th>商品名：</th>
                                <td><input class="common-text" name="prd_name" size="120" type="text" placeholder='小于50个字符' ></td>
                        </tr>
                        <tr>
                            <th width="120"><i class="require-red">*</i>分类：</th>
                            <td>
                                <select name="prd_class" id="catid" class="required">
                                    <option value="食品">食品</option>
                                    <option value="服饰">服饰</option>
                                    <option value="电子产品">电子产品</option>
                                    <option value="图书">图书</option>
                                    <option value="家电">家电</option>
                                    <option value="装饰品">装饰品</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                                <th><i class="require-red">*</i>价格：</th>
                                <td>
                                    <input class="common-text required" id="title" name="prd_price" size="50" value="" type="text">
                                </td>
                        </tr>
                        <tr>
                                <th>存量：</th>
                                <td><input class="common-text" name="prd_stockQty" size="50" placeholder="只能填数字" type="text"></td>
                        </tr>
                            <tr>
                                <th><i class="require-red">*</i>商品图片：</th>
                                <td><input name="prd_path" id="" type="file"><!--<input type="submit" onclick="submitForm('/jscss/admin/design/upload')" value="上传图片"/>--></td>
                            </tr>
                            <tr>
                                <th>图片预览：</th>
                                <td><textarea class="common-textarea" id="content" cols="30" style="width: 30%;" rows="10"></textarea></td>
                            </tr>
                        <tr>
                                <th></th>
                                <td>
                                    <input class="btn btn-primary btn6 mr10" value="提交" type="submit">
                                    <input class="btn btn6" onClick="history.go(-1)" value="返回" type="button">
                                </td>
                        </tr>
                        </tbody></table>
                </form>
            </div>
        </div>

    </div>
    <!--/main-->
</div>
</body>
</html>