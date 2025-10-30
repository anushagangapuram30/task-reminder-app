# Use Node.js official image
FROM node:18-alpine

# Set working directory
WORKDIR /app

# Copy package files and install dependencies
COPY package*.json ./
RUN npm install

# Copy the rest of the app (including index.html, server.js, etc.)
COPY . .

# Expose port 3000 (for the backend server)
EXPOSE 3000

# Start the app
CMD ["npm", "start"]