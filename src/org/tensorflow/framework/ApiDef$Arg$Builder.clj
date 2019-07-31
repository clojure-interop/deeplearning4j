(ns org.tensorflow.framework.ApiDef$Arg$Builder
  "Protobuf type tensorflow.ApiDef.Arg"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef$Arg$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ApiDef$Arg$Builder/getDescriptor )))

(defn clear-description
  "Note: this will replace any inherited arg doc. There is no
   current way of modifying arg descriptions (other than replacing
   them entirely) as can be done with op descriptions.
  string description = 3;

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this]
    (-> this (.clearDescription))))

(defn clear-name
  "string name = 1;

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this]
    (-> this (.clearName))))

(defn get-description-bytes
  "Note: this will replace any inherited arg doc. There is no
   current way of modifying arg descriptions (other than replacing
   them entirely) as can be done with op descriptions.
  string description = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Arg$Builder this]
    (-> this (.getDescriptionBytes))))

(defn set-description
  "Note: this will replace any inherited arg doc. There is no
   current way of modifying arg descriptions (other than replacing
   them entirely) as can be done with op descriptions.
  string description = 3;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^java.lang.String value]
    (-> this (.setDescription value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDef$Arg$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ApiDef$Arg$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDef$Arg$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Arg$Builder this]
    (-> this (.getNameBytes))))

(defn clear-rename-to
  "Change the name used to access this arg in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this]
    (-> this (.clearRenameTo))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn set-description-bytes
  "Note: this will replace any inherited arg doc. There is no
   current way of modifying arg descriptions (other than replacing
   them entirely) as can be done with op descriptions.
  string description = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDescriptionBytes value))))

(defn set-rename-to-bytes
  "Change the name used to access this arg in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setRenameToBytes value))))

(defn get-rename-to-bytes
  "Change the name used to access this arg in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Arg$Builder this]
    (-> this (.getRenameToBytes))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Arg$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDef$Arg$Builder this]
    (-> this (.build))))

(defn get-description
  "Note: this will replace any inherited arg doc. There is no
   current way of modifying arg descriptions (other than replacing
   them entirely) as can be done with op descriptions.
  string description = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Arg$Builder this]
    (-> this (.getDescription))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^ApiDef$Arg$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-rename-to
  "Change the name used to access this arg in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg$Builder this ^java.lang.String value]
    (-> this (.setRenameTo value))))

(defn get-rename-to
  "Change the name used to access this arg in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Arg$Builder this]
    (-> this (.getRenameTo))))

