FROM nginx:alpine

# Copy the HTML file to Nginx's default serving directory
COPY Taskreminder.html /usr/share/nginx/html/index.html

# Expose port 80
EXPOSE 80

# Start Nginx
CMD ["nginx", "-g", "daemon off;"]