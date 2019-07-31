(ns org.tensorflow.framework.ApiDef$Attr
  " Description of the graph-construction-time configuration of this
  Op.  That is to say, this describes the attr fields that will
  be specified in the NodeDef.
 Protobuf type tensorflow.ApiDef.Attr"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef$Attr]))

(def *-name-field-number
  "Static Constant.

  type: int"
  ApiDef$Attr/NAME_FIELD_NUMBER)

(def *-rename-to-field-number
  "Static Constant.

  type: int"
  ApiDef$Attr/RENAME_TO_FIELD_NUMBER)

(def *-default-value-field-number
  "Static Constant.

  type: int"
  ApiDef$Attr/DEFAULT_VALUE_FIELD_NUMBER)

(def *-description-field-number
  "Static Constant.

  type: int"
  ApiDef$Attr/DESCRIPTION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ApiDef$Attr/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef$Attr`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.ApiDef$Attr [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDef$Attr/parseFrom data extension-registry))
  (^org.tensorflow.framework.ApiDef$Attr [^java.nio.ByteBuffer data]
    (ApiDef$Attr/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef$Attr`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ApiDef$Attr [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDef$Attr/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.ApiDef$Attr [^java.io.InputStream input]
    (ApiDef$Attr/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.ApiDef$Attr`

  returns: `org.tensorflow.framework.ApiDef$Attr$Builder`"
  (^org.tensorflow.framework.ApiDef$Attr$Builder [^org.tensorflow.framework.ApiDef$Attr prototype]
    (ApiDef$Attr/newBuilder prototype))
  (^org.tensorflow.framework.ApiDef$Attr$Builder []
    (ApiDef$Attr/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.ApiDef$Attr`"
  (^org.tensorflow.framework.ApiDef$Attr []
    (ApiDef$Attr/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDef$Attr>`"
  (^com.github.os72.protobuf351.Parser []
    (ApiDef$Attr/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^ApiDef$Attr this]
    (-> this (.getUnknownFields))))

(defn get-description-bytes
  "Note: this will replace any inherited attr doc, there is no current
   way of modifying attr descriptions as can be done with op descriptions.
  string description = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Attr this]
    (-> this (.getDescriptionBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ApiDef$Attr this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ApiDef$Attr`"
  (^org.tensorflow.framework.ApiDef$Attr [^ApiDef$Attr this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Attr this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^ApiDef$Attr this]
    (-> this (.getSerializedSize))))

(defn get-default-value-or-builder
  "Specify a new default value to use for this attr.  This default
   will be used when creating new graphs, as opposed to the
   default in the OpDef, which will be used when interpreting old
   GraphDefs.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^ApiDef$Attr this]
    (-> this (.getDefaultValueOrBuilder))))

(defn get-default-value
  "Specify a new default value to use for this attr.  This default
   will be used when creating new graphs, as opposed to the
   default in the OpDef, which will be used when interpreting old
   GraphDefs.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^ApiDef$Attr this]
    (-> this (.getDefaultValue))))

(defn get-rename-to-bytes
  "Change the name used to access this attr in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Attr this]
    (-> this (.getRenameToBytes))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Attr this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^ApiDef$Attr this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-description
  "Note: this will replace any inherited attr doc, there is no current
   way of modifying attr descriptions as can be done with op descriptions.
  string description = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Attr this]
    (-> this (.getDescription))))

(defn has-default-value?
  "Specify a new default value to use for this attr.  This default
   will be used when creating new graphs, as opposed to the
   default in the OpDef, which will be used when interpreting old
   GraphDefs.
  .tensorflow.AttrValue default_value = 3;

  returns: `boolean`"
  (^Boolean [^ApiDef$Attr this]
    (-> this (.hasDefaultValue))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ApiDef$Attr this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDef$Attr>`"
  (^com.github.os72.protobuf351.Parser [^ApiDef$Attr this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ApiDef$Attr this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.ApiDef$Attr$Builder`"
  (^org.tensorflow.framework.ApiDef$Attr$Builder [^ApiDef$Attr this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.ApiDef$Attr$Builder`"
  (^org.tensorflow.framework.ApiDef$Attr$Builder [^ApiDef$Attr this]
    (-> this (.toBuilder))))

(defn get-rename-to
  "Change the name used to access this attr in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Attr this]
    (-> this (.getRenameTo))))

