(ns org.datavec.image.loader.AndroidNativeImageLoader
  "Segregates functionality specific to Android that is not available on Java SE."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.image.loader AndroidNativeImageLoader]))

(defn ->android-native-image-loader
  "Constructor.

  height - `int`
  width - `int`
  channels - `int`
  center-crop-if-needed - `boolean`"
  (^AndroidNativeImageLoader [^Integer height ^Integer width ^Integer channels ^Boolean center-crop-if-needed]
    (new AndroidNativeImageLoader height width channels center-crop-if-needed))
  (^AndroidNativeImageLoader [^Integer height ^Integer width ^Integer channels]
    (new AndroidNativeImageLoader height width channels))
  (^AndroidNativeImageLoader [^Integer height ^Integer width]
    (new AndroidNativeImageLoader height width))
  (^AndroidNativeImageLoader []
    (new AndroidNativeImageLoader )))

(defn as-row-vector
  "Description copied from class: NativeImageLoader

  image - `java.lang.Object`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AndroidNativeImageLoader this ^java.lang.Object image]
    (-> this (.asRowVector image))))

(defn as-matrix
  "Description copied from class: NativeImageLoader

  image - as a Bitmap or BufferedImage - `java.lang.Object`

  returns: the matrix or null for unsupported object classes - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AndroidNativeImageLoader this ^java.lang.Object image]
    (-> this (.asMatrix image))))

(defn as-bitmap
  "Converts an INDArray to a Bitmap. Only intended for images with rank 3.

  array - to convert - `org.nd4j.linalg.api.ndarray.INDArray`
  data-type - from JavaCV (DEPTH_FLOAT, DEPTH_UBYTE, etc), or -1 to use same type as the INDArray - `int`

  returns: data copied to a Frame - `android.graphics.Bitmap`"
  (^android.graphics.Bitmap [^AndroidNativeImageLoader this ^org.nd4j.linalg.api.ndarray.INDArray array ^Integer data-type]
    (-> this (.asBitmap array data-type)))
  (^android.graphics.Bitmap [^AndroidNativeImageLoader this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.asBitmap array))))

