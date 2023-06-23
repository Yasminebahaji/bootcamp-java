$(document).ready(function() {
    $("#toggleButton").click(function() {
      $("#myParagraph").toggleClass("red");
    });
  });
  
  document.addEventListener("DOMContentLoaded", function() {
    var toggleButtonBlue = document.getElementById("toggleButtonBlue");
    var myParagraph = document.getElementById("myParagraph");
    
    toggleButtonBlue.addEventListener("click", function() {
      myParagraph.classList.toggle("blue");
    });
  });