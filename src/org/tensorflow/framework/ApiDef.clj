(ns org.tensorflow.framework.ApiDef
  " Used to specify and override the default API & behavior in the
  generated code for client languages, from what you would get from
  the OpDef alone. There will be a set of ApiDefs that are common
  to all client languages, and another set per client language.
  The per-client-language ApiDefs will inherit values from the
  common ApiDefs which it can either replace or modify.
  We separate the API definition from the OpDef so we can evolve the
  API while remaining backwards compatible when interpretting old
  graphs.  Overrides go in an \"api_def.pbtxt\" file with a text-format
  ApiDefs message.
  WARNING: Be *very* careful changing the API for any existing op --
  you can change the semantics of existing code.  These changes may
  need to wait until a major release of TensorFlow to avoid breaking
  our compatibility promises.
 Protobuf type tensorflow.ApiDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef]))

(def *-graph-op-name-field-number
  "Static Constant.

  type: int"
  ApiDef/GRAPH_OP_NAME_FIELD_NUMBER)

(def *-visibility-field-number
  "Static Constant.

  type: int"
  ApiDef/VISIBILITY_FIELD_NUMBER)

(def *-endpoint-field-number
  "Static Constant.

  type: int"
  ApiDef/ENDPOINT_FIELD_NUMBER)

(def *-in-arg-field-number
  "Static Constant.

  type: int"
  ApiDef/IN_ARG_FIELD_NUMBER)

(def *-out-arg-field-number
  "Static Constant.

  type: int"
  ApiDef/OUT_ARG_FIELD_NUMBER)

(def *-arg-order-field-number
  "Static Constant.

  type: int"
  ApiDef/ARG_ORDER_FIELD_NUMBER)

(def *-attr-field-number
  "Static Constant.

  type: int"
  ApiDef/ATTR_FIELD_NUMBER)

(def *-summary-field-number
  "Static Constant.

  type: int"
  ApiDef/SUMMARY_FIELD_NUMBER)

(def *-description-field-number
  "Static Constant.

  type: int"
  ApiDef/DESCRIPTION_FIELD_NUMBER)

(def *-description-prefix-field-number
  "Static Constant.

  type: int"
  ApiDef/DESCRIPTION_PREFIX_FIELD_NUMBER)

(def *-description-suffix-field-number
  "Static Constant.

  type: int"
  ApiDef/DESCRIPTION_SUFFIX_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ApiDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.ApiDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.ApiDef [^java.nio.ByteBuffer data]
    (ApiDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ApiDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.ApiDef [^java.io.InputStream input]
    (ApiDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.ApiDef`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^org.tensorflow.framework.ApiDef prototype]
    (ApiDef/newBuilder prototype))
  (^org.tensorflow.framework.ApiDef$Builder []
    (ApiDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.ApiDef`"
  (^org.tensorflow.framework.ApiDef []
    (ApiDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDef>`"
  (^com.github.os72.protobuf351.Parser []
    (ApiDef/parser )))

(defn get-description-prefix-bytes
  "Modify an existing/inherited description by adding text to the beginning
   or end.
  string description_prefix = 9;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef this]
    (-> this (.getDescriptionPrefixBytes))))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^ApiDef this]
    (-> this (.getUnknownFields))))

(defn get-attr-or-builder
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$AttrOrBuilder`"
  (^org.tensorflow.framework.ApiDef$AttrOrBuilder [^ApiDef this ^Integer index]
    (-> this (.getAttrOrBuilder index))))

(defn get-in-arg-list
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Arg>`"
  (^java.util.List [^ApiDef this]
    (-> this (.getInArgList))))

(defn get-graph-op-name-bytes
  "Name of the op (in the OpDef) to specify the API for.
  string graph_op_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef this]
    (-> this (.getGraphOpNameBytes))))

(defn get-description-bytes
  "Additional, longer human-readable description of what the Op does.
  string description = 8;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef this]
    (-> this (.getDescriptionBytes))))

(defn get-attr-count
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `int`"
  (^Integer [^ApiDef this]
    (-> this (.getAttrCount))))

(defn get-arg-order-bytes
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef this ^Integer index]
    (-> this (.getArgOrderBytes index))))

(defn get-in-arg
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDef this ^Integer index]
    (-> this (.getInArg index))))

(defn get-in-arg-or-builder-list
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$ArgOrBuilder>`"
  ([^ApiDef this]
    (-> this (.getInArgOrBuilderList))))

(defn get-visibility
  ".tensorflow.ApiDef.Visibility visibility = 2;

  returns: `org.tensorflow.framework.ApiDef$Visibility`"
  (^org.tensorflow.framework.ApiDef$Visibility [^ApiDef this]
    (-> this (.getVisibility))))

(defn get-endpoint-count
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `int`"
  (^Integer [^ApiDef this]
    (-> this (.getEndpointCount))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ApiDef this]
    (-> this (.isInitialized))))

(defn get-in-arg-or-builder
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$ArgOrBuilder`"
  (^org.tensorflow.framework.ApiDef$ArgOrBuilder [^ApiDef this ^Integer index]
    (-> this (.getInArgOrBuilder index))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ApiDef`"
  (^org.tensorflow.framework.ApiDef [^ApiDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-graph-op-name
  "Name of the op (in the OpDef) to specify the API for.
  string graph_op_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef this]
    (-> this (.getGraphOpName))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^ApiDef this]
    (-> this (.getSerializedSize))))

(defn get-description-prefix
  "Modify an existing/inherited description by adding text to the beginning
   or end.
  string description_prefix = 9;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef this]
    (-> this (.getDescriptionPrefix))))

(defn get-endpoint-or-builder
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$EndpointOrBuilder`"
  (^org.tensorflow.framework.ApiDef$EndpointOrBuilder [^ApiDef this ^Integer index]
    (-> this (.getEndpointOrBuilder index))))

(defn get-attr-list
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Attr>`"
  (^java.util.List [^ApiDef this]
    (-> this (.getAttrList))))

(defn get-out-arg-or-builder
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$ArgOrBuilder`"
  (^org.tensorflow.framework.ApiDef$ArgOrBuilder [^ApiDef this ^Integer index]
    (-> this (.getOutArgOrBuilder index))))

(defn get-visibility-value
  ".tensorflow.ApiDef.Visibility visibility = 2;

  returns: `int`"
  (^Integer [^ApiDef this]
    (-> this (.getVisibilityValue))))

(defn get-attr
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Attr`"
  (^org.tensorflow.framework.ApiDef$Attr [^ApiDef this ^Integer index]
    (-> this (.getAttr index))))

(defn get-description-suffix-bytes
  "string description_suffix = 10;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef this]
    (-> this (.getDescriptionSuffixBytes))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^ApiDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-description
  "Additional, longer human-readable description of what the Op does.
  string description = 8;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef this]
    (-> this (.getDescription))))

(defn get-summary
  "One-line human-readable description of what the Op does.
  string summary = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef this]
    (-> this (.getSummary))))

(defn get-endpoint-list
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Endpoint>`"
  (^java.util.List [^ApiDef this]
    (-> this (.getEndpointList))))

(defn get-arg-order
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef this ^Integer index]
    (-> this (.getArgOrder index))))

(defn get-endpoint-or-builder-list
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$EndpointOrBuilder>`"
  ([^ApiDef this]
    (-> this (.getEndpointOrBuilderList))))

(defn get-out-arg-count
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `int`"
  (^Integer [^ApiDef this]
    (-> this (.getOutArgCount))))

(defn get-endpoint
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Endpoint`"
  (^org.tensorflow.framework.ApiDef$Endpoint [^ApiDef this ^Integer index]
    (-> this (.getEndpoint index))))

(defn get-out-arg
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDef this ^Integer index]
    (-> this (.getOutArg index))))

(defn get-summary-bytes
  "One-line human-readable description of what the Op does.
  string summary = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef this]
    (-> this (.getSummaryBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ApiDef this]
    (-> this (.hashCode))))

(defn get-arg-order-count
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  returns: `int`"
  (^Integer [^ApiDef this]
    (-> this (.getArgOrderCount))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDef>`"
  (^com.github.os72.protobuf351.Parser [^ApiDef this]
    (-> this (.getParserForType))))

(defn get-description-suffix
  "string description_suffix = 10;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef this]
    (-> this (.getDescriptionSuffix))))

(defn get-out-arg-list
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Arg>`"
  (^java.util.List [^ApiDef this]
    (-> this (.getOutArgList))))

(defn get-in-arg-count
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `int`"
  (^Integer [^ApiDef this]
    (-> this (.getInArgCount))))

(defn get-arg-order-list
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^ApiDef this]
    (-> this (.getArgOrderList))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ApiDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef this]
    (-> this (.newBuilderForType))))

(defn get-out-arg-or-builder-list
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$ArgOrBuilder>`"
  ([^ApiDef this]
    (-> this (.getOutArgOrBuilderList))))

(defn to-builder
  "returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef this]
    (-> this (.toBuilder))))

(defn get-attr-or-builder-list
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$AttrOrBuilder>`"
  ([^ApiDef this]
    (-> this (.getAttrOrBuilderList))))

