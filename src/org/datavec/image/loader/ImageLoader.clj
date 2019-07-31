(ns org.datavec.image.loader.ImageLoader
  "Image loader for taking images
 and converting them to matrices"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.loader ImageLoader]))

(defn ->image-loader
  "Constructor.

  Instantiate an image with the given
  height and width

  height - the height to load - `long`
  width - the width to load - `long`
  channels - the number of channels for the image* - `long`
  center-crop-if-needed - to crop before rescaling and converting - `boolean`"
  (^ImageLoader [^Long height ^Long width ^Long channels ^Boolean center-crop-if-needed]
    (new ImageLoader height width channels center-crop-if-needed))
  (^ImageLoader [^Long height ^Long width ^Long channels]
    (new ImageLoader height width channels))
  (^ImageLoader [^Long height ^Long width]
    (new ImageLoader height width))
  (^ImageLoader []
    (new ImageLoader )))

(defn *to-image
  "Convert a matrix in to a buffereed image

  matrix - the - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: BufferedImage - `java.awt.image.BufferedImage`"
  (^java.awt.image.BufferedImage [^org.nd4j.linalg.api.ndarray.INDArray matrix]
    (ImageLoader/toImage matrix)))

(defn *to-buffered-image
  "Converts a given Image into a BufferedImage

  img - The Image to be converted - `java.awt.Image`
  type - The color model of BufferedImage - `int`

  returns: The converted BufferedImage - `java.awt.image.BufferedImage`"
  (^java.awt.image.BufferedImage [^java.awt.Image img ^Integer type]
    (ImageLoader/toBufferedImage img type)))

(defn from-file
  "Load a rastered image from file

  file - the file to load - `java.io.File`

  returns: the rastered image - `int[][]`

  throws: java.io.IOException"
  ([^ImageLoader this ^java.io.File file]
    (-> this (.fromFile file))))

(defn as-image-matrix
  "f - `java.io.File`

  returns: `org.datavec.image.data.Image`

  throws: java.io.IOException"
  (^org.datavec.image.data.Image [^ImageLoader this ^java.io.File f]
    (-> this (.asImageMatrix f))))

(defn as-image-mini-batches
  "Slices up an image in to a mini batch.

  f - the file to load from - `java.io.File`
  num-mini-batches - the number of images in a mini batch - `int`
  num-rows-per-slice - the number of rows for each image - `int`

  returns: a tensor representing one image as a mini batch - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ImageLoader this ^java.io.File f ^Integer num-mini-batches ^Integer num-rows-per-slice]
    (-> this (.asImageMiniBatches f num-mini-batches num-rows-per-slice))))

(defn as-matrix
  "Convert an image file
  in to a matrix

  f - the file to convert - `java.io.File`

  returns: a 2d matrix of a rastered version of the image - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ImageLoader this ^java.io.File f]
    (-> this (.asMatrix f))))

(defn to-raveled-tensor
  "Changes the input stream in to an
  bgr based raveled(flattened) vector

  file - the input stream to convert - `java.io.File`

  returns: the raveled bgr values for this input stream - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ImageLoader this ^java.io.File file]
    (-> this (.toRaveledTensor file))))

(defn as-row-vector
  "Convert a file to a row vector

  f - the image to convert - `java.io.File`

  returns: the flattened image - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ImageLoader this ^java.io.File f]
    (-> this (.asRowVector f))))

(defn center-crop-if-needed
  "img - `java.awt.image.BufferedImage`

  returns: `java.awt.image.BufferedImage`"
  (^java.awt.image.BufferedImage [^ImageLoader this ^java.awt.image.BufferedImage img]
    (-> this (.centerCropIfNeeded img))))

(defn to-bgr
  "Convert an input stream to an bgr spectrum image

  file - the file to convert - `java.io.File`

  returns: the input stream to convert - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ImageLoader this ^java.io.File file]
    (-> this (.toBgr file))))

(defn from-file-multiple-channels
  "Load a rastered image from file

  file - the file to load - `java.io.File`

  returns: the rastered image - `int[][][]`

  throws: java.io.IOException"
  ([^ImageLoader this ^java.io.File file]
    (-> this (.fromFileMultipleChannels file))))

(defn to-buffered-image-rgb
  "Convert the given image to an rgb image

  arr - the array to use - `org.nd4j.linalg.api.ndarray.INDArray`
  image - the image to set - `java.awt.image.BufferedImage`"
  ([^ImageLoader this ^org.nd4j.linalg.api.ndarray.INDArray arr ^java.awt.image.BufferedImage image]
    (-> this (.toBufferedImageRGB arr image))))

(defn flattened-image-from-file
  "f - `java.io.File`

  returns: `int[]`

  throws: java.io.IOException"
  ([^ImageLoader this ^java.io.File f]
    (-> this (.flattenedImageFromFile f))))

