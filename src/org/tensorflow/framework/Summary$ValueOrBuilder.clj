(ns org.tensorflow.framework.Summary$ValueOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$ValueOrBuilder]))

(defn get-image
  ".tensorflow.Summary.Image image = 4;

  returns: `org.tensorflow.framework.Summary$Image`"
  (^org.tensorflow.framework.Summary$Image [^Summary$ValueOrBuilder this]
    (-> this (.getImage))))

(defn has-image?
  ".tensorflow.Summary.Image image = 4;

  returns: `boolean`"
  (^Boolean [^Summary$ValueOrBuilder this]
    (-> this (.hasImage))))

(defn get-histo
  ".tensorflow.HistogramProto histo = 5;

  returns: `org.tensorflow.framework.HistogramProto`"
  (^org.tensorflow.framework.HistogramProto [^Summary$ValueOrBuilder this]
    (-> this (.getHisto))))

(defn get-tag
  "Tag name for the data. Used by TensorBoard plugins to organize data. Tags
   are often organized by scope (which contains slashes to convey
   hierarchy). For example: foo/bar/0
  string tag = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^Summary$ValueOrBuilder this]
    (-> this (.getTag))))

(defn get-histo-or-builder
  ".tensorflow.HistogramProto histo = 5;

  returns: `org.tensorflow.framework.HistogramProtoOrBuilder`"
  (^org.tensorflow.framework.HistogramProtoOrBuilder [^Summary$ValueOrBuilder this]
    (-> this (.getHistoOrBuilder))))

(defn get-obsolete-old-style-histogram
  "bytes obsolete_old_style_histogram = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$ValueOrBuilder this]
    (-> this (.getObsoleteOldStyleHistogram))))

(defn has-histo?
  ".tensorflow.HistogramProto histo = 5;

  returns: `boolean`"
  (^Boolean [^Summary$ValueOrBuilder this]
    (-> this (.hasHisto))))

(defn has-metadata?
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `boolean`"
  (^Boolean [^Summary$ValueOrBuilder this]
    (-> this (.hasMetadata))))

(defn has-audio?
  ".tensorflow.Summary.Audio audio = 6;

  returns: `boolean`"
  (^Boolean [^Summary$ValueOrBuilder this]
    (-> this (.hasAudio))))

(defn get-simple-value
  "float simple_value = 2;

  returns: `float`"
  (^Float [^Summary$ValueOrBuilder this]
    (-> this (.getSimpleValue))))

(defn get-image-or-builder
  ".tensorflow.Summary.Image image = 4;

  returns: `org.tensorflow.framework.Summary$ImageOrBuilder`"
  (^org.tensorflow.framework.Summary$ImageOrBuilder [^Summary$ValueOrBuilder this]
    (-> this (.getImageOrBuilder))))

(defn has-tensor?
  ".tensorflow.TensorProto tensor = 8;

  returns: `boolean`"
  (^Boolean [^Summary$ValueOrBuilder this]
    (-> this (.hasTensor))))

(defn get-node-name
  "This field is deprecated and will not be set.
  string node_name = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^Summary$ValueOrBuilder this]
    (-> this (.getNodeName))))

(defn get-node-name-bytes
  "This field is deprecated and will not be set.
  string node_name = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$ValueOrBuilder this]
    (-> this (.getNodeNameBytes))))

(defn get-audio-or-builder
  ".tensorflow.Summary.Audio audio = 6;

  returns: `org.tensorflow.framework.Summary$AudioOrBuilder`"
  (^org.tensorflow.framework.Summary$AudioOrBuilder [^Summary$ValueOrBuilder this]
    (-> this (.getAudioOrBuilder))))

(defn get-tensor-or-builder
  ".tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^Summary$ValueOrBuilder this]
    (-> this (.getTensorOrBuilder))))

(defn get-value-case
  "returns: `org.tensorflow.framework.Summary$Value$ValueCase`"
  (^org.tensorflow.framework.Summary$Value$ValueCase [^Summary$ValueOrBuilder this]
    (-> this (.getValueCase))))

(defn get-metadata-or-builder
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `org.tensorflow.framework.SummaryMetadataOrBuilder`"
  (^org.tensorflow.framework.SummaryMetadataOrBuilder [^Summary$ValueOrBuilder this]
    (-> this (.getMetadataOrBuilder))))

(defn get-metadata
  "Contains metadata on the summary value such as which plugins may use it.
   Take note that many summary values may lack a metadata field. This is
   because the FileWriter only keeps a metadata object on the first summary
   value with a certain tag for each tag. TensorBoard then remembers which
   tags are associated with which plugins. This saves space.
  .tensorflow.SummaryMetadata metadata = 9;

  returns: `org.tensorflow.framework.SummaryMetadata`"
  (^org.tensorflow.framework.SummaryMetadata [^Summary$ValueOrBuilder this]
    (-> this (.getMetadata))))

(defn get-audio
  ".tensorflow.Summary.Audio audio = 6;

  returns: `org.tensorflow.framework.Summary$Audio`"
  (^org.tensorflow.framework.Summary$Audio [^Summary$ValueOrBuilder this]
    (-> this (.getAudio))))

(defn get-tensor
  ".tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^Summary$ValueOrBuilder this]
    (-> this (.getTensor))))

(defn get-tag-bytes
  "Tag name for the data. Used by TensorBoard plugins to organize data. Tags
   are often organized by scope (which contains slashes to convey
   hierarchy). For example: foo/bar/0
  string tag = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^Summary$ValueOrBuilder this]
    (-> this (.getTagBytes))))

