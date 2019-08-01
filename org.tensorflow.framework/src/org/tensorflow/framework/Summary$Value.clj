(ns org.tensorflow.framework.Summary$Value
  "Protobuf type tensorflow.Summary.Value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$Value]))

(def *-node-name-field-number
  "Static Constant.

  type: int"
  Summary$Value/NODE_NAME_FIELD_NUMBER)

(def *-tag-field-number
  "Static Constant.

  type: int"
  Summary$Value/TAG_FIELD_NUMBER)

(def *-metadata-field-number
  "Static Constant.

  type: int"
  Summary$Value/METADATA_FIELD_NUMBER)

(def *-simple-value-field-number
  "Static Constant.

  type: int"
  Summary$Value/SIMPLE_VALUE_FIELD_NUMBER)

(def *-obsolete-old-style-histogram-field-number
  "Static Constant.

  type: int"
  Summary$Value/OBSOLETE_OLD_STYLE_HISTOGRAM_FIELD_NUMBER)

(def *-image-field-number
  "Static Constant.

  type: int"
  Summary$Value/IMAGE_FIELD_NUMBER)

(def *-histo-field-number
  "Static Constant.

  type: int"
  Summary$Value/HISTO_FIELD_NUMBER)

(def *-audio-field-number
  "Static Constant.

  type: int"
  Summary$Value/AUDIO_FIELD_NUMBER)

(def *-tensor-field-number
  "Static Constant.

  type: int"
  Summary$Value/TENSOR_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (Summary$Value/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Value`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.Summary$Value [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (Summary$Value/parseFrom data extension-registry))
  (^org.tensorflow.framework.Summary$Value [^java.nio.ByteBuffer data]
    (Summary$Value/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Value`

  throws: java.io.IOException"
  (^org.tensorflow.framework.Summary$Value [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (Summary$Value/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.Summary$Value [^java.io.InputStream input]
    (Summary$Value/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.Summary$Value`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^org.tensorflow.framework.Summary$Value prototype]
    (Summary$Value/newBuilder prototype))
  (^org.tensorflow.framework.Summary$Value$Builder []
    (Summary$Value/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.Summary$Value`"
  (^org.tensorflow.framework.Summary$Value []
    (Summary$Value/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.Summary$Value>`"
  (^com.github.os72.protobuf351.Parser []
    (Summary$Value/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^Summary$Value this]
    (-> this (.getUnknownFields))))

(defn get-image
  ".tensorflow.Summary.Image image = 4;

  returns: `org.tensorflow.framework.Summary$Image`"
  (^org.tensorflow.framework.Summary$Image [^Summary$Value this]
    (-> this (.getImage))))

(defn has-image?
  ".tensorflow.Summary.Image image = 4;

  returns: `boolean`"
  (^Boolean [^Summary$Value this]
    (-> this (.hasImage))))

(defn get-histo
  ".tensorflow.HistogramProto histo = 5;

  returns: `org.tensorflow.framework.HistogramProto`"
  (^org.tensorflow.framework.HistogramProto [^Summary$Value this]
    (-> this (.getHisto))))

(defn get-tag
  "Tag name for the data. Used by TensorBoard plugins to organize data. Tags
   are often organized by scope (which contains slashes to convey
   hierarchy). For example: foo/bar/0
  string tag = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^Summary$Value this]
    (-> this (.getTag))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^Summary$Value this]
    (-> this (.isInitialized))))

(defn get-histo-or-builder
  ".tensorflow.HistogramProto histo = 5;

  returns: `org.tensorflow.framework.HistogramProtoOrBuilder`"
  (^org.tensorflow.framework.HistogramProtoOrBuilder [^Summary$Value this]
    (-> this (.getHistoOrBuilder))))

(defn get-obsolete-old-style-histogram
  "bytes obsolete_old_style_histogram = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Value this]
    (-> this (.getObsoleteOldStyleHistogram))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.Summary$Value`"
  (^org.tensorflow.framework.Summary$Value [^Summary$Value this]
    (-> this (.getDefaultInstanceForType))))

(defn has-histo?
  ".tensorflow.HistogramProto histo = 5;

  returns: `boolean`"
  (^Boolean [^Summary$Value this]
    (-> this (.hasHisto))))

(defn has-metadata?
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `boolean`"
  (^Boolean [^Summary$Value this]
    (-> this (.hasMetadata))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^Summary$Value this]
    (-> this (.getSerializedSize))))

(defn has-audio?
  ".tensorflow.Summary.Audio audio = 6;

  returns: `boolean`"
  (^Boolean [^Summary$Value this]
    (-> this (.hasAudio))))

(defn get-simple-value
  "float simple_value = 2;

  returns: `float`"
  (^Float [^Summary$Value this]
    (-> this (.getSimpleValue))))

(defn get-image-or-builder
  ".tensorflow.Summary.Image image = 4;

  returns: `org.tensorflow.framework.Summary$ImageOrBuilder`"
  (^org.tensorflow.framework.Summary$ImageOrBuilder [^Summary$Value this]
    (-> this (.getImageOrBuilder))))

(defn has-tensor?
  ".tensorflow.TensorProto tensor = 8;

  returns: `boolean`"
  (^Boolean [^Summary$Value this]
    (-> this (.hasTensor))))

(defn get-node-name
  "This field is deprecated and will not be set.
  string node_name = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^Summary$Value this]
    (-> this (.getNodeName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^Summary$Value this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-node-name-bytes
  "This field is deprecated and will not be set.
  string node_name = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Value this]
    (-> this (.getNodeNameBytes))))

(defn get-audio-or-builder
  ".tensorflow.Summary.Audio audio = 6;

  returns: `org.tensorflow.framework.Summary$AudioOrBuilder`"
  (^org.tensorflow.framework.Summary$AudioOrBuilder [^Summary$Value this]
    (-> this (.getAudioOrBuilder))))

(defn get-tensor-or-builder
  ".tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^Summary$Value this]
    (-> this (.getTensorOrBuilder))))

(defn get-value-case
  "returns: `org.tensorflow.framework.Summary$Value$ValueCase`"
  (^org.tensorflow.framework.Summary$Value$ValueCase [^Summary$Value this]
    (-> this (.getValueCase))))

(defn get-metadata-or-builder
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `org.tensorflow.framework.SummaryMetadataOrBuilder`"
  (^org.tensorflow.framework.SummaryMetadataOrBuilder [^Summary$Value this]
    (-> this (.getMetadataOrBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Summary$Value this]
    (-> this (.hashCode))))

(defn get-metadata
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `org.tensorflow.framework.SummaryMetadata`"
  (^org.tensorflow.framework.SummaryMetadata [^Summary$Value this]
    (-> this (.getMetadata))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.Summary$Value>`"
  (^com.github.os72.protobuf351.Parser [^Summary$Value this]
    (-> this (.getParserForType))))

(defn get-audio
  ".tensorflow.Summary.Audio audio = 6;

  returns: `org.tensorflow.framework.Summary$Audio`"
  (^org.tensorflow.framework.Summary$Audio [^Summary$Value this]
    (-> this (.getAudio))))

(defn get-tensor
  ".tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^Summary$Value this]
    (-> this (.getTensor))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Summary$Value this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value this]
    (-> this (.newBuilderForType))))

(defn get-tag-bytes
  "Tag name for the data. Used by TensorBoard plugins to organize data. Tags
   are often organized by scope (which contains slashes to convey
   hierarchy). For example: foo/bar/0
  string tag = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Value this]
    (-> this (.getTagBytes))))

(defn to-builder
  "returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value this]
    (-> this (.toBuilder))))

