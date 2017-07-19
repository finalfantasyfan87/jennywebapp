<jsp:include page="common/commonLayout.jsp" />
<input type="hidden" id="imagePage" value="imagePage">
<div class = "centered">
    <h2>Final Fantasy XV Images</h2>
</div>

<div class="image-container">
	<button id="previous" class="previous round"><<</button>
    <br>
	<img id="myImage" class="imageResize" src="${images[0]}">
    <br>
    <br>
	<button id="next" class="next round">>></button>
</div>

<input type="hidden" id="images" value="${images}">
<div class="image-container">

	<div class="image-container">
		<ul class="list-unstyled product-items"/>
	</div>
</div>

<jsp:include page="common/footer.jsp" />
</body>
</html>