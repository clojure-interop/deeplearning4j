(ns org.tensorflow.framework.Summary$Value$Builder
  "Protobuf type tensorflow.Summary.Value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$Value$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (Summary$Value$Builder/getDescriptor )))

(defn get-image
  ".tensorflow.Summary.Image image = 4;

  returns: `org.tensorflow.framework.Summary$Image`"
  (^org.tensorflow.framework.Summary$Image [^Summary$Value$Builder this]
    (-> this (.getImage))))

(defn get-tensor-builder
  ".tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^Summary$Value$Builder this]
    (-> this (.getTensorBuilder))))

(defn set-node-name-bytes
  "This field is deprecated and will not be set.
  string node_name = 7;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNodeNameBytes value))))

(defn set-tag-bytes
  "Tag name for the data. Used by TensorBoard plugins to organize data. Tags
   are often organized by scope (which contains slashes to convey
   hierarchy). For example: foo/bar/0
  string tag = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setTagBytes value))))

(defn set-simple-value
  "float simple_value = 2;

  value - `float`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^Float value]
    (-> this (.setSimpleValue value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-audio-builder
  ".tensorflow.Summary.Audio audio = 6;

  returns: `org.tensorflow.framework.Summary$Audio$Builder`"
  (^org.tensorflow.framework.Summary$Audio$Builder [^Summary$Value$Builder this]
    (-> this (.getAudioBuilder))))

(defn clear-histo
  ".tensorflow.HistogramProto histo = 5;

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearHisto))))

(defn has-image?
  ".tensorflow.Summary.Image image = 4;

  returns: `boolean`"
  (^Boolean [^Summary$Value$Builder this]
    (-> this (.hasImage))))

(defn build-partial
  "returns: `org.tensorflow.framework.Summary$Value`"
  (^org.tensorflow.framework.Summary$Value [^Summary$Value$Builder this]
    (-> this (.buildPartial))))

(defn get-histo
  ".tensorflow.HistogramProto histo = 5;

  returns: `org.tensorflow.framework.HistogramProto`"
  (^org.tensorflow.framework.HistogramProto [^Summary$Value$Builder this]
    (-> this (.getHisto))))

(defn get-tag
  "Tag name for the data. Used by TensorBoard plugins to organize data. Tags
   are often organized by scope (which contains slashes to convey
   hierarchy). For example: foo/bar/0
  string tag = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^Summary$Value$Builder this]
    (-> this (.getTag))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^Summary$Value$Builder this]
    (-> this (.isInitialized))))

(defn get-histo-or-builder
  ".tensorflow.HistogramProto histo = 5;

  returns: `org.tensorflow.framework.HistogramProtoOrBuilder`"
  (^org.tensorflow.framework.HistogramProtoOrBuilder [^Summary$Value$Builder this]
    (-> this (.getHistoOrBuilder))))

(defn get-obsolete-old-style-histogram
  "bytes obsolete_old_style_histogram = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Value$Builder this]
    (-> this (.getObsoleteOldStyleHistogram))))

(defn clear-metadata
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearMetadata))))

(defn set-audio
  ".tensorflow.Summary.Audio audio = 6;

  value - `org.tensorflow.framework.Summary$Audio`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.Summary$Audio value]
    (-> this (.setAudio value))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.Summary$Value`"
  (^org.tensorflow.framework.Summary$Value [^Summary$Value$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-image
  ".tensorflow.Summary.Image image = 4;

  value - `org.tensorflow.framework.Summary$Image`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.Summary$Image value]
    (-> this (.setImage value))))

(defn get-histo-builder
  ".tensorflow.HistogramProto histo = 5;

  returns: `org.tensorflow.framework.HistogramProto$Builder`"
  (^org.tensorflow.framework.HistogramProto$Builder [^Summary$Value$Builder this]
    (-> this (.getHistoBuilder))))

(defn has-histo?
  ".tensorflow.HistogramProto histo = 5;

  returns: `boolean`"
  (^Boolean [^Summary$Value$Builder this]
    (-> this (.hasHisto))))

(defn clear-image
  ".tensorflow.Summary.Image image = 4;

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearImage))))

(defn merge-metadata
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  value - `org.tensorflow.framework.SummaryMetadata`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.SummaryMetadata value]
    (-> this (.mergeMetadata value))))

(defn merge-tensor
  ".tensorflow.TensorProto tensor = 8;

  value - `org.tensorflow.framework.TensorProto`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.TensorProto value]
    (-> this (.mergeTensor value))))

(defn has-metadata?
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `boolean`"
  (^Boolean [^Summary$Value$Builder this]
    (-> this (.hasMetadata))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-audio
  ".tensorflow.Summary.Audio audio = 6;

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearAudio))))

(defn clear-simple-value
  "float simple_value = 2;

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearSimpleValue))))

(defn clear-value
  "returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearValue))))

(defn get-image-builder
  ".tensorflow.Summary.Image image = 4;

  returns: `org.tensorflow.framework.Summary$Image$Builder`"
  (^org.tensorflow.framework.Summary$Image$Builder [^Summary$Value$Builder this]
    (-> this (.getImageBuilder))))

(defn clear-obsolete-old-style-histogram
  "bytes obsolete_old_style_histogram = 3;

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearObsoleteOldStyleHistogram))))

(defn has-audio?
  ".tensorflow.Summary.Audio audio = 6;

  returns: `boolean`"
  (^Boolean [^Summary$Value$Builder this]
    (-> this (.hasAudio))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-simple-value
  "float simple_value = 2;

  returns: `float`"
  (^Float [^Summary$Value$Builder this]
    (-> this (.getSimpleValue))))

(defn set-node-name
  "This field is deprecated and will not be set.
  string node_name = 7;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^java.lang.String value]
    (-> this (.setNodeName value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-image-or-builder
  ".tensorflow.Summary.Image image = 4;

  returns: `org.tensorflow.framework.Summary$ImageOrBuilder`"
  (^org.tensorflow.framework.Summary$ImageOrBuilder [^Summary$Value$Builder this]
    (-> this (.getImageOrBuilder))))

(defn has-tensor?
  ".tensorflow.TensorProto tensor = 8;

  returns: `boolean`"
  (^Boolean [^Summary$Value$Builder this]
    (-> this (.hasTensor))))

(defn get-node-name
  "This field is deprecated and will not be set.
  string node_name = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^Summary$Value$Builder this]
    (-> this (.getNodeName))))

(defn merge-histo
  ".tensorflow.HistogramProto histo = 5;

  value - `org.tensorflow.framework.HistogramProto`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.HistogramProto value]
    (-> this (.mergeHisto value))))

(defn build
  "returns: `org.tensorflow.framework.Summary$Value`"
  (^org.tensorflow.framework.Summary$Value [^Summary$Value$Builder this]
    (-> this (.build))))

(defn get-node-name-bytes
  "This field is deprecated and will not be set.
  string node_name = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Value$Builder this]
    (-> this (.getNodeNameBytes))))

(defn clear-tag
  "Tag name for the data. Used by TensorBoard plugins to organize data. Tags
   are often organized by scope (which contains slashes to convey
   hierarchy). For example: foo/bar/0
  string tag = 1;

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearTag))))

(defn get-audio-or-builder
  ".tensorflow.Summary.Audio audio = 6;

  returns: `org.tensorflow.framework.Summary$AudioOrBuilder`"
  (^org.tensorflow.framework.Summary$AudioOrBuilder [^Summary$Value$Builder this]
    (-> this (.getAudioOrBuilder))))

(defn merge-audio
  ".tensorflow.Summary.Audio audio = 6;

  value - `org.tensorflow.framework.Summary$Audio`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.Summary$Audio value]
    (-> this (.mergeAudio value))))

(defn get-tensor-or-builder
  ".tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^Summary$Value$Builder this]
    (-> this (.getTensorOrBuilder))))

(defn get-value-case
  "returns: `org.tensorflow.framework.Summary$Value$ValueCase`"
  (^org.tensorflow.framework.Summary$Value$ValueCase [^Summary$Value$Builder this]
    (-> this (.getValueCase))))

(defn get-metadata-or-builder
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `org.tensorflow.framework.SummaryMetadataOrBuilder`"
  (^org.tensorflow.framework.SummaryMetadataOrBuilder [^Summary$Value$Builder this]
    (-> this (.getMetadataOrBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Value$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-tensor
  ".tensorflow.TensorProto tensor = 8;

  value - `org.tensorflow.framework.TensorProto`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.TensorProto value]
    (-> this (.setTensor value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^Summary$Value$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-node-name
  "This field is deprecated and will not be set.
  string node_name = 7;

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearNodeName))))

(defn set-tag
  "Tag name for the data. Used by TensorBoard plugins to organize data. Tags
   are often organized by scope (which contains slashes to convey
   hierarchy). For example: foo/bar/0
  string tag = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^java.lang.String value]
    (-> this (.setTag value))))

(defn get-metadata
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `org.tensorflow.framework.SummaryMetadata`"
  (^org.tensorflow.framework.SummaryMetadata [^Summary$Value$Builder this]
    (-> this (.getMetadata))))

(defn clear
  "returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-metadata-builder
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `org.tensorflow.framework.SummaryMetadata$Builder`"
  (^org.tensorflow.framework.SummaryMetadata$Builder [^Summary$Value$Builder this]
    (-> this (.getMetadataBuilder))))

(defn get-audio
  ".tensorflow.Summary.Audio audio = 6;

  returns: `org.tensorflow.framework.Summary$Audio`"
  (^org.tensorflow.framework.Summary$Audio [^Summary$Value$Builder this]
    (-> this (.getAudio))))

(defn set-histo
  ".tensorflow.HistogramProto histo = 5;

  value - `org.tensorflow.framework.HistogramProto`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.HistogramProto value]
    (-> this (.setHisto value))))

(defn get-tensor
  ".tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^Summary$Value$Builder this]
    (-> this (.getTensor))))

(defn merge-image
  ".tensorflow.Summary.Image image = 4;

  value - `org.tensorflow.framework.Summary$Image`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.Summary$Image value]
    (-> this (.mergeImage value))))

(defn set-obsolete-old-style-histogram
  "bytes obsolete_old_style_histogram = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setObsoleteOldStyleHistogram value))))

(defn clear-tensor
  ".tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this]
    (-> this (.clearTensor))))

(defn set-metadata
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  value - `org.tensorflow.framework.SummaryMetadata`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Value$Builder this ^org.tensorflow.framework.SummaryMetadata value]
    (-> this (.setMetadata value))))

(defn get-tag-bytes
  "Tag name for the data. Used by TensorBoard plugins to organize data. Tags
   are often organized by scope (which contains slashes to convey
   hierarchy). For example: foo/bar/0
  string tag = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$Value$Builder this]
    (-> this (.getTagBytes))))

