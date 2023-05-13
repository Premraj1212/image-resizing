# Image Resizing
Just a fun project made it for my brother working more on images. 

### Resizing images based on dimension : width X height

## Stack

| Category       | Value         |
|----------------|---------------|
| Language       | Java          |
 | Image library  | imgscalr-lib  |
| Build Tool     | Maven         |


## features
* Program can pick up all photos in source folder.
* New Resized images will be pushed to target folder.
* The BufferedImage class is a cornerstone of the Java 2D immediate-mode imaging API. It manages the image in memory and provides methods for storing, interpreting, and obtaining pixel data. Since BufferedImage is a subclass of Image it can be rendered by the Graphics and Graphics2D methods that accept an Image parameter.
* ImageIO class provides the convenience method for reading and writing image and perfuming simple encoding and decoding.


Run tests:
```$xslt
compile exec:java "-Dexec.args=input output 800 800"
```
