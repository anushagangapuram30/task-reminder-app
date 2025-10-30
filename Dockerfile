# Use Nginx official image (lightweight, no JS runtime)
FROM nginx:alpine

# Copy your HTML file to Nginx's serving directory
COPY taskreminder.html /usr/share/nginx/html/index.html

# Expose port 80 (Nginx default)
EXPOSE 80

# Start Nginx (serves the HTML at the root)
CMD ["nginx", "-g", "daemon off;"]