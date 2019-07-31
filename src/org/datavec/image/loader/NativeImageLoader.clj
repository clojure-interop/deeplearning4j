(ns org.datavec.image.loader.NativeImageLoader
  "Uses JavaCV to load images. Allowed formats: bmp, gif, jpg, jpeg, jp2, pbm, pgm, ppm, pnm, png, tif, tiff, exr, webp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.loader NativeImageLoader]))

(defn ->native-image-loader
  "Constructor.

  Instantiate an image with the given
  height and width

  height - the height to load - `long`
  width - the width to load - `long`
  channels - the number of channels for the image* - `long`
  center-crop-if-needed - to crop before rescaling and converting - `boolean`"
  (^NativeImageLoader [^Long height ^Long width ^Long channels ^Boolean center-crop-if-needed]
    (new NativeImageLoader height width channels center-crop-if-needed))
  (^NativeImageLoader [^Long height ^Long width ^Long channels]
    (new NativeImageLoader height width channels))
  (^NativeImageLoader [^Long height ^Long width]
    (new NativeImageLoader height width))
  (^NativeImageLoader []
    (new NativeImageLoader )))

(def *-allowed-formats
  "Static Constant.

  type: java.lang.String[]"
  NativeImageLoader/ALLOWED_FORMATS)

(defn get-allowed-formats
  "returns: `java.lang.String[]`"
  ([^NativeImageLoader this]
    (-> this (.getAllowedFormats))))

(defn as-row-vector
  "Convert a file to a row vector

  f - the image to convert - `java.io.File`

  returns: the flattened image - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NativeImageLoader this ^java.io.File f]
    (-> this (.asRowVector f))))

(defn as-matrix
  "Calls AndroidNativeImageLoader.asMatrix(android.graphics.Bitmap) or
  Java2DNativeImageLoader.asMatrix(java.awt.image.BufferedImage).

  image - as a Bitmap or BufferedImage - `java.lang.Object`

  returns: the matrix or null for unsupported object classes - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NativeImageLoader this ^java.lang.Object image]
    (-> this (.asMatrix image))))

(defn as-image-matrix
  "f - `java.io.File`

  returns: `org.datavec.image.data.Image`

  throws: java.io.IOException"
  (^org.datavec.image.data.Image [^NativeImageLoader this ^java.io.File f]
    (-> this (.asImageMatrix f))))

(defn as-matrix-view
  "is - `java.io.InputStream`
  view - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  ([^NativeImageLoader this ^java.io.InputStream is ^org.nd4j.linalg.api.ndarray.INDArray view]
    (-> this (.asMatrixView is view))))

(defn as-writable
  "Convert a file to a INDArray

  f - the image to convert - `java.io.File`

  returns: INDArray - `org.datavec.image.data.ImageWritable`

  throws: java.io.IOException"
  (^org.datavec.image.data.ImageWritable [^NativeImageLoader this ^java.io.File f]
    (-> this (.asWritable f))))

(defn as-frame
  "Converts an INDArray to a JavaCV Frame. Only intended for images with rank 3.

  array - to convert - `org.nd4j.linalg.api.ndarray.INDArray`
  data-type - from JavaCV (DEPTH_FLOAT, DEPTH_UBYTE, etc), or -1 to use same type as the INDArray - `int`

  returns: data copied to a Frame - `org.bytedeco.javacv.Frame`"
  (^org.bytedeco.javacv.Frame [^NativeImageLoader this ^org.nd4j.linalg.api.ndarray.INDArray array ^Integer data-type]
    (-> this (.asFrame array data-type)))
  (^org.bytedeco.javacv.Frame [^NativeImageLoader this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.asFrame array))))

(defn as-mat
  "Converts an INDArray to an OpenCV Mat. Only intended for images with rank 3.

  array - to convert - `org.nd4j.linalg.api.ndarray.INDArray`
  data-type - from OpenCV (CV_32F, CV_8U, etc), or -1 to use same type as the INDArray - `int`

  returns: data copied to a Mat - `org.bytedeco.javacpp.opencv_core.Mat`"
  (^org.bytedeco.javacpp.opencv_core.Mat [^NativeImageLoader this ^org.nd4j.linalg.api.ndarray.INDArray array ^Integer data-type]
    (-> this (.asMat array data-type)))
  (^org.bytedeco.javacpp.opencv_core.Mat [^NativeImageLoader this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.asMat array))))

