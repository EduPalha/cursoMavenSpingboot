mkdir /home/$USER/config-properties
cp /home/$USER/'Área de Trabalho'/farmcont/config-properties/*.* /home/$USER/config-properties
cd /home/$USER/config-properties/
git init 
git add . -A
git commit -m "commit m"
docker cp /home/$USER/config-properties config:/
rm -r /home/$USER/config-properties -f
