mvn package fabric8:build
docker-compose down
docker-compose up -d
echo "Done! Access http://localhost:3001"
