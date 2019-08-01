(ns org.tensorflow.framework.ApiDef$Builder
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
  (:import [org.tensorflow.framework ApiDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ApiDef$Builder/getDescriptor )))

(defn get-description-prefix-bytes
  "Modify an existing/inherited description by adding text to the beginning
   or end.
  string description_prefix = 9;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Builder this]
    (-> this (.getDescriptionPrefixBytes))))

(defn clear-description
  "Additional, longer human-readable description of what the Op does.
  string description = 8;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearDescription))))

(defn get-attr-or-builder
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$AttrOrBuilder`"
  (^org.tensorflow.framework.ApiDef$AttrOrBuilder [^ApiDef$Builder this ^Integer index]
    (-> this (.getAttrOrBuilder index))))

(defn get-in-arg-list
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Arg>`"
  (^java.util.List [^ApiDef$Builder this]
    (-> this (.getInArgList))))

(defn get-graph-op-name-bytes
  "Name of the op (in the OpDef) to specify the API for.
  string graph_op_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Builder this]
    (-> this (.getGraphOpNameBytes))))

(defn get-description-bytes
  "Additional, longer human-readable description of what the Op does.
  string description = 8;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Builder this]
    (-> this (.getDescriptionBytes))))

(defn set-description
  "Additional, longer human-readable description of what the Op does.
  string description = 8;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.String value]
    (-> this (.setDescription value))))

(defn set-summary-bytes
  "One-line human-readable description of what the Op does.
  string summary = 7;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setSummaryBytes value))))

(defn remove-out-arg
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.removeOutArg index))))

(defn get-attr-count
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `int`"
  (^Integer [^ApiDef$Builder this]
    (-> this (.getAttrCount))))

(defn add-endpoint-builder
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.addEndpointBuilder index)))
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Builder this]
    (-> this (.addEndpointBuilder))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-arg-order-bytes
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Builder this ^Integer index]
    (-> this (.getArgOrderBytes index))))

(defn build-partial
  "returns: `org.tensorflow.framework.ApiDef`"
  (^org.tensorflow.framework.ApiDef [^ApiDef$Builder this]
    (-> this (.buildPartial))))

(defn get-in-arg
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDef$Builder this ^Integer index]
    (-> this (.getInArg index))))

(defn add-arg-order
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.String value]
    (-> this (.addArgOrder value))))

(defn clear-description-prefix
  "Modify an existing/inherited description by adding text to the beginning
   or end.
  string description_prefix = 9;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearDescriptionPrefix))))

(defn get-in-arg-or-builder-list
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$ArgOrBuilder>`"
  ([^ApiDef$Builder this]
    (-> this (.getInArgOrBuilderList))))

(defn get-visibility
  ".tensorflow.ApiDef.Visibility visibility = 2;

  returns: `org.tensorflow.framework.ApiDef$Visibility`"
  (^org.tensorflow.framework.ApiDef$Visibility [^ApiDef$Builder this]
    (-> this (.getVisibility))))

(defn get-endpoint-count
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `int`"
  (^Integer [^ApiDef$Builder this]
    (-> this (.getEndpointCount))))

(defn set-arg-order
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  index - `int`
  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index ^java.lang.String value]
    (-> this (.setArgOrder index value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ApiDef$Builder this]
    (-> this (.isInitialized))))

(defn get-in-arg-or-builder
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$ArgOrBuilder`"
  (^org.tensorflow.framework.ApiDef$ArgOrBuilder [^ApiDef$Builder this ^Integer index]
    (-> this (.getInArgOrBuilder index))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ApiDef`"
  (^org.tensorflow.framework.ApiDef [^ApiDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn get-graph-op-name
  "Name of the op (in the OpDef) to specify the API for.
  string graph_op_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Builder this]
    (-> this (.getGraphOpName))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-in-arg-builder
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.getInArgBuilder index))))

(defn set-description-suffix-bytes
  "string description_suffix = 10;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDescriptionSuffixBytes value))))

(defn get-in-arg-builder-list
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Arg$Builder>`"
  (^java.util.List [^ApiDef$Builder this]
    (-> this (.getInArgBuilderList))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-description-prefix
  "Modify an existing/inherited description by adding text to the beginning
   or end.
  string description_prefix = 9;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Builder this]
    (-> this (.getDescriptionPrefix))))

(defn set-visibility-value
  ".tensorflow.ApiDef.Visibility visibility = 2;

  value - `int`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer value]
    (-> this (.setVisibilityValue value))))

(defn get-out-arg-builder-list
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Arg$Builder>`"
  (^java.util.List [^ApiDef$Builder this]
    (-> this (.getOutArgBuilderList))))

(defn remove-in-arg
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.removeInArg index))))

(defn get-endpoint-or-builder
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$EndpointOrBuilder`"
  (^org.tensorflow.framework.ApiDef$EndpointOrBuilder [^ApiDef$Builder this ^Integer index]
    (-> this (.getEndpointOrBuilder index))))

(defn clear-in-arg
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearInArg))))

(defn set-description-bytes
  "Additional, longer human-readable description of what the Op does.
  string description = 8;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDescriptionBytes value))))

(defn clear-endpoint
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearEndpoint))))

(defn remove-attr
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.removeAttr index))))

(defn get-attr-list
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Attr>`"
  (^java.util.List [^ApiDef$Builder this]
    (-> this (.getAttrList))))

(defn get-out-arg-or-builder
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$ArgOrBuilder`"
  (^org.tensorflow.framework.ApiDef$ArgOrBuilder [^ApiDef$Builder this ^Integer index]
    (-> this (.getOutArgOrBuilder index))))

(defn set-graph-op-name-bytes
  "Name of the op (in the OpDef) to specify the API for.
  string graph_op_name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setGraphOpNameBytes value))))

(defn add-arg-order-bytes
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addArgOrderBytes value))))

(defn add-attr
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`
  value - `org.tensorflow.framework.ApiDef$Attr`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index ^org.tensorflow.framework.ApiDef$Attr value]
    (-> this (.addAttr index value)))
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^org.tensorflow.framework.ApiDef$Attr value]
    (-> this (.addAttr value))))

(defn add-all-attr
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllAttr values))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-out-arg
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`
  value - `org.tensorflow.framework.ApiDef$Arg`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index ^org.tensorflow.framework.ApiDef$Arg value]
    (-> this (.addOutArg index value)))
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^org.tensorflow.framework.ApiDef$Arg value]
    (-> this (.addOutArg value))))

(defn add-out-arg-builder
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.addOutArgBuilder index)))
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Builder this]
    (-> this (.addOutArgBuilder))))

(defn set-graph-op-name
  "Name of the op (in the OpDef) to specify the API for.
  string graph_op_name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.String value]
    (-> this (.setGraphOpName value))))

(defn get-visibility-value
  ".tensorflow.ApiDef.Visibility visibility = 2;

  returns: `int`"
  (^Integer [^ApiDef$Builder this]
    (-> this (.getVisibilityValue))))

(defn get-attr
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Attr`"
  (^org.tensorflow.framework.ApiDef$Attr [^ApiDef$Builder this ^Integer index]
    (-> this (.getAttr index))))

(defn clear-attr
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearAttr))))

(defn get-description-suffix-bytes
  "string description_suffix = 10;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Builder this]
    (-> this (.getDescriptionSuffixBytes))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn clear-summary
  "One-line human-readable description of what the Op does.
  string summary = 7;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearSummary))))

(defn build
  "returns: `org.tensorflow.framework.ApiDef`"
  (^org.tensorflow.framework.ApiDef [^ApiDef$Builder this]
    (-> this (.build))))

(defn get-description
  "Additional, longer human-readable description of what the Op does.
  string description = 8;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Builder this]
    (-> this (.getDescription))))

(defn clear-arg-order
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearArgOrder))))

(defn set-endpoint
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`
  value - `org.tensorflow.framework.ApiDef$Endpoint`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index ^org.tensorflow.framework.ApiDef$Endpoint value]
    (-> this (.setEndpoint index value))))

(defn get-summary
  "One-line human-readable description of what the Op does.
  string summary = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Builder this]
    (-> this (.getSummary))))

(defn get-attr-builder-list
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Attr$Builder>`"
  (^java.util.List [^ApiDef$Builder this]
    (-> this (.getAttrBuilderList))))

(defn get-endpoint-list
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Endpoint>`"
  (^java.util.List [^ApiDef$Builder this]
    (-> this (.getEndpointList))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn add-all-out-arg
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOutArg values))))

(defn add-endpoint
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`
  value - `org.tensorflow.framework.ApiDef$Endpoint`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index ^org.tensorflow.framework.ApiDef$Endpoint value]
    (-> this (.addEndpoint index value)))
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^org.tensorflow.framework.ApiDef$Endpoint value]
    (-> this (.addEndpoint value))))

(defn remove-endpoint
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.removeEndpoint index))))

(defn get-arg-order
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Builder this ^Integer index]
    (-> this (.getArgOrder index))))

(defn add-in-arg
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`
  value - `org.tensorflow.framework.ApiDef$Arg`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index ^org.tensorflow.framework.ApiDef$Arg value]
    (-> this (.addInArg index value)))
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^org.tensorflow.framework.ApiDef$Arg value]
    (-> this (.addInArg value))))

(defn set-in-arg
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`
  value - `org.tensorflow.framework.ApiDef$Arg`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index ^org.tensorflow.framework.ApiDef$Arg value]
    (-> this (.setInArg index value))))

(defn get-endpoint-or-builder-list
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$EndpointOrBuilder>`"
  ([^ApiDef$Builder this]
    (-> this (.getEndpointOrBuilderList))))

(defn add-all-arg-order
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllArgOrder values))))

(defn get-out-arg-count
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `int`"
  (^Integer [^ApiDef$Builder this]
    (-> this (.getOutArgCount))))

(defn get-endpoint-builder-list
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Endpoint$Builder>`"
  (^java.util.List [^ApiDef$Builder this]
    (-> this (.getEndpointBuilderList))))

(defn get-endpoint
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Endpoint`"
  (^org.tensorflow.framework.ApiDef$Endpoint [^ApiDef$Builder this ^Integer index]
    (-> this (.getEndpoint index))))

(defn set-description-prefix
  "Modify an existing/inherited description by adding text to the beginning
   or end.
  string description_prefix = 9;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.String value]
    (-> this (.setDescriptionPrefix value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-visibility
  ".tensorflow.ApiDef.Visibility visibility = 2;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearVisibility))))

(defn get-out-arg
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDef$Builder this ^Integer index]
    (-> this (.getOutArg index))))

(defn clone
  "returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clone))))

(defn set-description-suffix
  "string description_suffix = 10;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.String value]
    (-> this (.setDescriptionSuffix value))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^ApiDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-description-suffix
  "string description_suffix = 10;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearDescriptionSuffix))))

(defn get-summary-bytes
  "One-line human-readable description of what the Op does.
  string summary = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Builder this]
    (-> this (.getSummaryBytes))))

(defn get-arg-order-count
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  returns: `int`"
  (^Integer [^ApiDef$Builder this]
    (-> this (.getArgOrderCount))))

(defn set-summary
  "One-line human-readable description of what the Op does.
  string summary = 7;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.String value]
    (-> this (.setSummary value))))

(defn clear-graph-op-name
  "Name of the op (in the OpDef) to specify the API for.
  string graph_op_name = 1;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearGraphOpName))))

(defn clear-out-arg
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clearOutArg))))

(defn clear
  "returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this]
    (-> this (.clear))))

(defn add-in-arg-builder
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.addInArgBuilder index)))
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Builder this]
    (-> this (.addInArgBuilder))))

(defn set-visibility
  ".tensorflow.ApiDef.Visibility visibility = 2;

  value - `org.tensorflow.framework.ApiDef$Visibility`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^org.tensorflow.framework.ApiDef$Visibility value]
    (-> this (.setVisibility value))))

(defn get-attr-builder
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Attr$Builder`"
  (^org.tensorflow.framework.ApiDef$Attr$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.getAttrBuilder index))))

(defn get-endpoint-builder
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.getEndpointBuilder index))))

(defn get-out-arg-builder
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.getOutArgBuilder index))))

(defn get-description-suffix
  "string description_suffix = 10;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Builder this]
    (-> this (.getDescriptionSuffix))))

(defn set-attr
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`
  value - `org.tensorflow.framework.ApiDef$Attr`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index ^org.tensorflow.framework.ApiDef$Attr value]
    (-> this (.setAttr index value))))

(defn add-all-endpoint
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllEndpoint values))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-out-arg-list
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Arg>`"
  (^java.util.List [^ApiDef$Builder this]
    (-> this (.getOutArgList))))

(defn get-in-arg-count
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `int`"
  (^Integer [^ApiDef$Builder this]
    (-> this (.getInArgCount))))

(defn get-arg-order-list
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^ApiDef$Builder this]
    (-> this (.getArgOrderList))))

(defn set-out-arg
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`
  value - `org.tensorflow.framework.ApiDef$Arg`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^Integer index ^org.tensorflow.framework.ApiDef$Arg value]
    (-> this (.setOutArg index value))))

(defn set-description-prefix-bytes
  "Modify an existing/inherited description by adding text to the beginning
   or end.
  string description_prefix = 9;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDescriptionPrefixBytes value))))

(defn get-out-arg-or-builder-list
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$ArgOrBuilder>`"
  ([^ApiDef$Builder this]
    (-> this (.getOutArgOrBuilderList))))

(defn add-attr-builder
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Attr$Builder`"
  (^org.tensorflow.framework.ApiDef$Attr$Builder [^ApiDef$Builder this ^Integer index]
    (-> this (.addAttrBuilder index)))
  (^org.tensorflow.framework.ApiDef$Attr$Builder [^ApiDef$Builder this]
    (-> this (.addAttrBuilder))))

(defn get-attr-or-builder-list
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$AttrOrBuilder>`"
  ([^ApiDef$Builder this]
    (-> this (.getAttrOrBuilderList))))

(defn add-all-in-arg
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInArg values))))

