(ns org.tensorflow.framework.Summary$Image
  "Protobuf type tensorflow.Summary.Image"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$Image]))

(def *-height-field-number
  "Static Constant.

  type: int"
  Summary$Image/HEIGHT_FIELD_NUMBER)

(def *-width-field-number
  "Static Constant.

  type: int"
  Summary$Image/WIDTH_FIELD_NUMBER)

(def *-colorspace-field-number
  "Static Constant.

  type: int"
  Summary$Image/COLORSPACE_FIELD_NUMBER)

(def *-encoded-image-string-field-number
  "Static Constant.

  type: int"
  Summary$Image/ENCODED_IMAGE_STRING_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (Summary$Image/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Image`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.Summary$Image [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (Summary$Image/parseFrom data extension-registry))
  (^org.tensorflow.framework.Summary$Image [^java.nio.ByteBuffer data]
    (Summary$Image/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Image`

  throws: java.io.IOException"
  (^org.tensorflow.framework.Summary$Image [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (Summary$Image/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.Summary$Image [^java.io.InputStream input]
    (Summary$Image/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.Summary$Image`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^org.tensorflow.framework.Summary$Image prototype]
    (Summary$Image/newBuilder prototype))
  (^org.tensorflow.framework.Summary$Image$Builder []
    (Summary$Image/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.Summary$Image`"
  (^org.tensorflow.framework.Summary$Image []
    (Summary$Image/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.Summary$Image>`"
  (^com.github.os72.protobuf351.Parser []
    (Summary$Image/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^Summary$Image this]
    (-> this (.getUnknownFields))))

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
  (^Integer [^Summary$Image this]
    (-> this (.getColorspace))))

(defn get-width
  "int32 width = 2;

  returns: `int`"
  (^Integer [^Summary$Image this]
    (-> this (.getWidth))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^Summary$Image this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.Summary$Image`"
  (^org.tensorflow.framework.Summary$Image [^Summary$Image this]
    (-> this (.getDefaultInstanceForType))))

(defn get-encoded-image-string
  "Image data in encoded format.  All image formats supported by
   image_codec::CoderUtil can be stored here.
  bytes encoded_image_string = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Image this]
    (-> this (.getEncodedImageString))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^Summary$Image this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^Summary$Image this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-height
  "Dimensions of the image.
  int32 height = 1;

  returns: `int`"
  (^Integer [^Summary$Image this]
    (-> this (.getHeight))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Summary$Image this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.Summary$Image>`"
  (^com.github.os72.protobuf351.Parser [^Summary$Image this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Summary$Image this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image this]
    (-> this (.toBuilder))))

