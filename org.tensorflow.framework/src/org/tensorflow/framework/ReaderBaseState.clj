(ns org.tensorflow.framework.ReaderBaseState
  " For serializing and restoring the state of ReaderBase, see
  reader_base.h for details.
 Protobuf type tensorflow.ReaderBaseState"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ReaderBaseState]))

(def *-work-started-field-number
  "Static Constant.

  type: int"
  ReaderBaseState/WORK_STARTED_FIELD_NUMBER)

(def *-work-finished-field-number
  "Static Constant.

  type: int"
  ReaderBaseState/WORK_FINISHED_FIELD_NUMBER)

(def *-num-records-produced-field-number
  "Static Constant.

  type: int"
  ReaderBaseState/NUM_RECORDS_PRODUCED_FIELD_NUMBER)

(def *-current-work-field-number
  "Static Constant.

  type: int"
  ReaderBaseState/CURRENT_WORK_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ReaderBaseState/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ReaderBaseState`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.ReaderBaseState [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ReaderBaseState/parseFrom data extension-registry))
  (^org.tensorflow.framework.ReaderBaseState [^java.nio.ByteBuffer data]
    (ReaderBaseState/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ReaderBaseState`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ReaderBaseState [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ReaderBaseState/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.ReaderBaseState [^java.io.InputStream input]
    (ReaderBaseState/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.ReaderBaseState`

  returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^org.tensorflow.framework.ReaderBaseState prototype]
    (ReaderBaseState/newBuilder prototype))
  (^org.tensorflow.framework.ReaderBaseState$Builder []
    (ReaderBaseState/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.ReaderBaseState`"
  (^org.tensorflow.framework.ReaderBaseState []
    (ReaderBaseState/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ReaderBaseState>`"
  (^com.github.os72.protobuf351.Parser []
    (ReaderBaseState/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^ReaderBaseState this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ReaderBaseState this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ReaderBaseState`"
  (^org.tensorflow.framework.ReaderBaseState [^ReaderBaseState this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^ReaderBaseState this]
    (-> this (.getSerializedSize))))

(defn get-num-records-produced
  "int64 num_records_produced = 3;

  returns: `long`"
  (^Long [^ReaderBaseState this]
    (-> this (.getNumRecordsProduced))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^ReaderBaseState this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-work-finished
  "int64 work_finished = 2;

  returns: `long`"
  (^Long [^ReaderBaseState this]
    (-> this (.getWorkFinished))))

(defn get-current-work
  "bytes current_work = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ReaderBaseState this]
    (-> this (.getCurrentWork))))

(defn get-work-started
  "int64 work_started = 1;

  returns: `long`"
  (^Long [^ReaderBaseState this]
    (-> this (.getWorkStarted))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ReaderBaseState this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ReaderBaseState>`"
  (^com.github.os72.protobuf351.Parser [^ReaderBaseState this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ReaderBaseState this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.ReaderBaseState$Builder`"
  (^org.tensorflow.framework.ReaderBaseState$Builder [^ReaderBaseState this]
    (-> this (.toBuilder))))

