document.getElementById('formId').addEventListener('submit' , function(event){
    event.preventDefault(); // Prevent the default form submission

    //get form data 
    const formData= new FormData(event.target);
    const data = {
        // adminId:formData.get('adminId'),
        username:formData.get('username'),
        password:formData.get('password')
    };

     // Make the POST request

     fetch('http://localhost:9090/admin/register' , {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })

    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok: ' + response.statusText + ' (status: ' + response.status + ')');
        }
        return response.text();
    })
    .then(responseText => {
        console.log('Success:', responseText);
        alert('Data submitted successfully!');
    })
    .catch(error => {
        console.error('Error submitting data:', error);
        alert('Error submitting data: ' + error.message);

    });
});
