(ns org.tensorflow.framework.Summary$Image$Builder
  "Protobuf type tensorflow.Summary.Image"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$Image$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (Summary$Image$Builder/getDescriptor )))

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
  (^Integer [^Summary$Image$Builder this]
    (-> this (.getColorspace))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-width
  "int32 width = 2;

  returns: `int`"
  (^Integer [^Summary$Image$Builder this]
    (-> this (.getWidth))))

(defn set-colorspace
  "Valid colorspace values are
     1 - grayscale
     2 - grayscale  alpha
     3 - RGB
     4 - RGBA
     5 - DIGITAL_YUV
     6 - BGRA
  int32 colorspace = 3;

  value - `int`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^Integer value]
    (-> this (.setColorspace value))))

(defn build-partial
  "returns: `org.tensorflow.framework.Summary$Image`"
  (^org.tensorflow.framework.Summary$Image [^Summary$Image$Builder this]
    (-> this (.buildPartial))))

(defn set-width
  "int32 width = 2;

  value - `int`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^Integer value]
    (-> this (.setWidth value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^Summary$Image$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.Summary$Image`"
  (^org.tensorflow.framework.Summary$Image [^Summary$Image$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-encoded-image-string
  "Image data in encoded format.  All image formats supported by
   image_codec::CoderUtil can be stored here.
  bytes encoded_image_string = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Image$Builder this]
    (-> this (.getEncodedImageString))))

(defn set-height
  "Dimensions of the image.
  int32 height = 1;

  value - `int`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^Integer value]
    (-> this (.setHeight value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-width
  "int32 width = 2;

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this]
    (-> this (.clearWidth))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.Summary$Image`"
  (^org.tensorflow.framework.Summary$Image [^Summary$Image$Builder this]
    (-> this (.build))))

(defn get-height
  "Dimensions of the image.
  int32 height = 1;

  returns: `int`"
  (^Integer [^Summary$Image$Builder this]
    (-> this (.getHeight))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Image$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^Summary$Image$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this]
    (-> this (.clear))))

(defn clear-encoded-image-string
  "Image data in encoded format.  All image formats supported by
   image_codec::CoderUtil can be stored here.
  bytes encoded_image_string = 4;

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this]
    (-> this (.clearEncodedImageString))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-encoded-image-string
  "Image data in encoded format.  All image formats supported by
   image_codec::CoderUtil can be stored here.
  bytes encoded_image_string = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setEncodedImageString value))))

(defn clear-height
  "Dimensions of the image.
  int32 height = 1;

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this]
    (-> this (.clearHeight))))

(defn clear-colorspace
  "Valid colorspace values are
     1 - grayscale
     2 - grayscale  alpha
     3 - RGB
     4 - RGBA
     5 - DIGITAL_YUV
     6 - BGRA
  int32 colorspace = 3;

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Image$Builder this]
    (-> this (.clearColorspace))))

