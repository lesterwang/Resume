goog.require('goog.dom');

function sayHi() {
	var newHeader = goog.dom.createDom('h1', { 'style': 'backgroud-color: #EEE'}, 'Hello world!');
	goog.dom.appendChild(document.body, newHeader);
}