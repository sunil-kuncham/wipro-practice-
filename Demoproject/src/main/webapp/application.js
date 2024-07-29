document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('tableForm');
    const table = document.getElementById('dataTable').getElementsByTagName('tbody')[0];

    form.addEventListener('submit', function(event) {
        event.preventDefault();
        
        // Get form values
        const name = document.getElementById('Student Name').value;
        
        const email = document.getElementById('Student Email').value;
		const phno = document.getElementById('Student Number').value;

        // Create a new row and cells
        const newRow = table.insertRow();
        const nameCell = newRow.insertCell(0);
        const ageCell = newRow.insertCell(1);
        const emailCell = newRow.insertCell(2);

        // Add values to cells
        nameCell.textContent = name;
        ageCell.textContent = age;
        emailCell.textContent = email;

        // Clear form fields
        form.reset();
    });
});
