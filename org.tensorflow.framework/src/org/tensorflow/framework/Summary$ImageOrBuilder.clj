(ns org.tensorflow.framework.Summary$ImageOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$ImageOrBuilder]))

(defn get-height
  "Dimensions of the image.
  int32 height = 1;

  returns: `int`"
  (^Integer [^Summary$ImageOrBuilder this]
    (-> this (.getHeight))))

(defn get-width
  "int32 width = 2;

  returns: `int`"
  (^Integer [^Summary$ImageOrBuilder this]
    (-> this (.getWidth))))

(defn get-colorspace
  "Valid colorspace values are
     1 - grayscale
     2 - grayscale  alpha
     3 - RGB
     4 - RGBA
     5 - DIGITAL_YUV
     6 - BGRA
  int32 colorspace = 3;

  returns: `int`"
  (^Integer [^Summary$ImageOrBuilder this]
    (-> this (.getColorspace))))

(defn get-encoded-image-string
  "Image data in encoded format.  All image formats supported by
   image_codec::CoderUtil can be stored here.
  bytes encoded_image_string = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$ImageOrBuilder this]
    (-> this (.getEncodedImageString))))

