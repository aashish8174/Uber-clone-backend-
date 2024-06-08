// JavaScript to handle redirection based on user selection
document.addEventListener('DOMContentLoaded', () => {
    document.getElementById('admin-btn').addEventListener('click', () => {
      window.location.href = 'model/admin.html';
    });
  
    document.getElementById('customer-btn').addEventListener('click', () => {
      window.location.href = 'model/customer.html';
    });
  
    document.getElementById('driver-btn').addEventListener('click', () => {
      window.location.href = 'model/driver.html';
    });
  });
  