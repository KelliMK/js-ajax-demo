const button = document.querySelector('button')
button.addEventListener('click', addContentToSidebar)

function addContentToSidebar() {
	// Creates a new AJAX request
	var xhttp = new XMLHttpRequest()
	// Sets behavior for when the AJAX request is complete
	xhttp.addEventListener('readystatechange', function() {
		// Checks the ready state and http status code
		if (isReady(xhttp)) {
			// Typical action to be performed when the document is ready:
			const sidebar = document.querySelector('aside')

			 sidebar.innerHTML += this.response

		}
	})
	/*
	** Opens the request and sets the type of request,
	** location of the data,
	** and whether the request is asynchronous
	*/

	xhttp.open('GET', '../sidebar.html', true)
	// Sends the request to the server
	xhttp.send()
}

const button2 = document.querySelector('.button2')
button2.addEventListener('click', getLukeSkywalker)

function getLukeSkywalker() {
	var xhr = new XMLHttpRequest()
	xhr.onreadystatechange = function() {
		console.log('readyState is currently:', this.readyState)
		if (isReady(xhr)) {
			// Get JSON from the returned string
			const res = JSON.parse(xhr.responseText)
			// Typical action to be performed when the document is ready:
			console.log(res)
			document.querySelector('aside').innerHTML = `
				<h2>${res.name}</h2>
				<p>Eye color: ${res.eye_color}</p>
				<p>Made up thing: ${res.gender}</p>
			`
		}
	}
	/*
	** Notice in this example we are hitting and actual url
	** and returning whatever we get from the API we're accessing
	*/
	xhr.open('GET', 'https://swapi.co/api/people/1/', true)
	xhr.send()
}

function isReady(request) {
	return request.readyState == 4 && request.status == 200
}