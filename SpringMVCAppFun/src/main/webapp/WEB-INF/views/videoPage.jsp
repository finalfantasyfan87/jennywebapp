<jsp:include page="common/commonLayout.jsp"/>
<input type="hidden" id="videoPage" value="videoPage">

<input type="hidden" id="videos" value="${videos}">
<div class="centered">
    <h2 class="text-color">Gaming Videos</h2>
</div>

<video width="600" controls>
    <source src="${videos[0]}" type="video/mp4">
</video>

<video width="600" controls>
    <source src="${videos[1]}" type="video/mp4">
</video>


<video width="600" controls>
    <source src="${videos[2]}" type="video/mp4">
</video>


<video width="600" controls>
    <source src="${videos[3]}" type="video/mp4">
</video>


<video width="600" controls>
    <source src="${videos[4]}" type="video/mp4">
</video>

<jsp:include page="common/footer.jsp"/>

</body>
</html>