/* global data */

function createCube(n) {
   return promise("http://localhost:8080/test-back-end/api/Cube/CreateCube/n/" + n, 'POST', {});
}

function updateCube(count, x, y ,z, w) {
   return promise("http://localhost:8080/test-back-end/api/Cube/UpdateCube/count/" + count + "/x/" + x + "/y/" + y + "/z/" + z + "/w/" + w, 'PUT', {});
}



function promise(url, method, object) {
    return fetch(url, {
        method: method,
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(object)
    })
    .then(data => data);
}
