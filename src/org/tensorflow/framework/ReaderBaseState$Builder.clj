(ns org.tensorflow.framework.ReaderBaseState$Builder
  " For serializing and restoring the state of ReaderBase, see
  reader_base.h for details.
 Protobuf type tensorflow.ReaderBaseState"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ReaderBaseState$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ReaderBaseState$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.ReaderBaseState`"
  (^org.tensorflow.framework.ReaderBaseState [^ReaderBaseState$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ReaderBaseState$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ReaderBaseState`"
  (^org.tensorflow.framework.ReaderBaseState [^ReaderBaseState$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-num-records-produced
  "int64 num_records_produced = 3;

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this]
    (-> this (.clearNumRecordsProduced))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-num-records-produced
  "int64 num_records_produced = 3;

  value - `long`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^Long value]
    (-> this (.setNumRecordsProduced value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-num-records-produced
  "int64 num_records_produced = 3;

  returns: `long`"
  (^Long [^ReaderBaseState$Builder this]
    (-> this (.getNumRecordsProduced))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.ReaderBaseState`"
  (^org.tensorflow.framework.ReaderBaseState [^ReaderBaseState$Builder this]
    (-> this (.build))))

(defn set-work-finished
  "int64 work_finished = 2;

  value - `long`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^Long value]
    (-> this (.setWorkFinished value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-work-finished
  "int64 work_finished = 2;

  returns: `long`"
  (^Long [^ReaderBaseState$Builder this]
    (-> this (.getWorkFinished))))

(defn get-current-work
  "bytes current_work = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ReaderBaseState$Builder this]
    (-> this (.getCurrentWork))))

(defn set-work-started
  "int64 work_started = 1;

  value - `long`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^Long value]
    (-> this (.setWorkStarted value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-work-started
  "int64 work_started = 1;

  returns: `long`"
  (^Long [^ReaderBaseState$Builder this]
    (-> this (.getWorkStarted))))

(defn clone
  "returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^ReaderBaseState$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-work-started
  "int64 work_started = 1;

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this]
    (-> this (.clearWorkStarted))))

(defn clear
  "returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this]
    (-> this (.clear))))

(defn set-current-work
  "bytes current_work = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setCurrentWork value))))

(defn clear-current-work
  "bytes current_work = 4;

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this]
    (-> this (.clearCurrentWork))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-work-finished
  "int64 work_finished = 2;

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState$Builder this]
    (-> this (.clearWorkFinished))))

