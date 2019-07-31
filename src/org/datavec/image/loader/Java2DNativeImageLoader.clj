(ns org.datavec.image.loader.Java2DNativeImageLoader
  "Segregates functionality specific to Java 2D that is not available on Android."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.loader Java2DNativeImageLoader]))

(defn ->java-2-d-native-image-loader
  "Constructor.

  height - `int`
  width - `int`
  channels - `int`
  center-crop-if-needed - `boolean`"
  (^Java2DNativeImageLoader [^Integer height ^Integer width ^Integer channels ^Boolean center-crop-if-needed]
    (new Java2DNativeImageLoader height width channels center-crop-if-needed))
  (^Java2DNativeImageLoader [^Integer height ^Integer width ^Integer channels]
    (new Java2DNativeImageLoader height width channels))
  (^Java2DNativeImageLoader [^Integer height ^Integer width]
    (new Java2DNativeImageLoader height width))
  (^Java2DNativeImageLoader []
    (new Java2DNativeImageLoader )))

(defn as-row-vector
  "Returns asMatrix(image, flipChannels).ravel().

  image - `java.awt.image.BufferedImage`
  flip-channels - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Java2DNativeImageLoader this ^java.awt.image.BufferedImage image ^Boolean flip-channels]
    (-> this (.asRowVector image flip-channels)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Java2DNativeImageLoader this ^java.awt.image.BufferedImage image]
    (-> this (.asRowVector image))))

(defn as-matrix
  "Loads a INDArray from a BufferedImage.

  image - as a BufferedImage - `java.awt.image.BufferedImage`
  flip-channels - to have a format like TYPE_INT_RGB (ARGB) output as BGRA, etc - `boolean`

  returns: the loaded matrix - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Java2DNativeImageLoader this ^java.awt.image.BufferedImage image ^Boolean flip-channels]
    (-> this (.asMatrix image flip-channels)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^Java2DNativeImageLoader this ^java.awt.image.BufferedImage image]
    (-> this (.asMatrix image))))

(defn as-buffered-image
  "Converts an INDArray to a BufferedImage. Only intended for images with rank 3.

  array - to convert - `org.nd4j.linalg.api.ndarray.INDArray`
  data-type - from JavaCV (DEPTH_FLOAT, DEPTH_UBYTE, etc), or -1 to use same type as the INDArray - `int`

  returns: data copied to a Frame - `java.awt.image.BufferedImage`"
  (^java.awt.image.BufferedImage [^Java2DNativeImageLoader this ^org.nd4j.linalg.api.ndarray.INDArray array ^Integer data-type]
    (-> this (.asBufferedImage array data-type)))
  (^java.awt.image.BufferedImage [^Java2DNativeImageLoader this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.asBufferedImage array))))

