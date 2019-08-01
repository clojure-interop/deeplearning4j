(ns org.tensorflow.framework.ApiDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDefOrBuilder]))

(defn get-description-prefix-bytes
  "Modify an existing/inherited description by adding text to the beginning
   or end.
  string description_prefix = 9;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDefOrBuilder this]
    (-> this (.getDescriptionPrefixBytes))))

(defn get-attr-or-builder
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$AttrOrBuilder`"
  (^org.tensorflow.framework.ApiDef$AttrOrBuilder [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getAttrOrBuilder index))))

(defn get-in-arg-list
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Arg>`"
  (^java.util.List [^ApiDefOrBuilder this]
    (-> this (.getInArgList))))

(defn get-graph-op-name-bytes
  "Name of the op (in the OpDef) to specify the API for.
  string graph_op_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDefOrBuilder this]
    (-> this (.getGraphOpNameBytes))))

(defn get-description-bytes
  "Additional, longer human-readable description of what the Op does.
  string description = 8;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDefOrBuilder this]
    (-> this (.getDescriptionBytes))))

(defn get-attr-count
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `int`"
  (^Integer [^ApiDefOrBuilder this]
    (-> this (.getAttrCount))))

(defn get-arg-order-bytes
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getArgOrderBytes index))))

(defn get-in-arg
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getInArg index))))

(defn get-in-arg-or-builder-list
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$ArgOrBuilder>`"
  ([^ApiDefOrBuilder this]
    (-> this (.getInArgOrBuilderList))))

(defn get-visibility
  ".tensorflow.ApiDef.Visibility visibility = 2;

  returns: `org.tensorflow.framework.ApiDef$Visibility`"
  (^org.tensorflow.framework.ApiDef$Visibility [^ApiDefOrBuilder this]
    (-> this (.getVisibility))))

(defn get-endpoint-count
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `int`"
  (^Integer [^ApiDefOrBuilder this]
    (-> this (.getEndpointCount))))

(defn get-in-arg-or-builder
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$ArgOrBuilder`"
  (^org.tensorflow.framework.ApiDef$ArgOrBuilder [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getInArgOrBuilder index))))

(defn get-graph-op-name
  "Name of the op (in the OpDef) to specify the API for.
  string graph_op_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDefOrBuilder this]
    (-> this (.getGraphOpName))))

(defn get-description-prefix
  "Modify an existing/inherited description by adding text to the beginning
   or end.
  string description_prefix = 9;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDefOrBuilder this]
    (-> this (.getDescriptionPrefix))))

(defn get-endpoint-or-builder
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$EndpointOrBuilder`"
  (^org.tensorflow.framework.ApiDef$EndpointOrBuilder [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getEndpointOrBuilder index))))

(defn get-attr-list
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Attr>`"
  (^java.util.List [^ApiDefOrBuilder this]
    (-> this (.getAttrList))))

(defn get-out-arg-or-builder
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$ArgOrBuilder`"
  (^org.tensorflow.framework.ApiDef$ArgOrBuilder [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getOutArgOrBuilder index))))

(defn get-visibility-value
  ".tensorflow.ApiDef.Visibility visibility = 2;

  returns: `int`"
  (^Integer [^ApiDefOrBuilder this]
    (-> this (.getVisibilityValue))))

(defn get-attr
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Attr`"
  (^org.tensorflow.framework.ApiDef$Attr [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getAttr index))))

(defn get-description-suffix-bytes
  "string description_suffix = 10;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDefOrBuilder this]
    (-> this (.getDescriptionSuffixBytes))))

(defn get-description
  "Additional, longer human-readable description of what the Op does.
  string description = 8;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDefOrBuilder this]
    (-> this (.getDescription))))

(defn get-summary
  "One-line human-readable description of what the Op does.
  string summary = 7;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDefOrBuilder this]
    (-> this (.getSummary))))

(defn get-endpoint-list
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Endpoint>`"
  (^java.util.List [^ApiDefOrBuilder this]
    (-> this (.getEndpointList))))

(defn get-arg-order
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getArgOrder index))))

(defn get-endpoint-or-builder-list
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$EndpointOrBuilder>`"
  ([^ApiDefOrBuilder this]
    (-> this (.getEndpointOrBuilderList))))

(defn get-out-arg-count
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `int`"
  (^Integer [^ApiDefOrBuilder this]
    (-> this (.getOutArgCount))))

(defn get-endpoint
  "repeated .tensorflow.ApiDef.Endpoint endpoint = 3;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Endpoint`"
  (^org.tensorflow.framework.ApiDef$Endpoint [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getEndpoint index))))

(defn get-out-arg
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDefOrBuilder this ^Integer index]
    (-> this (.getOutArg index))))

(defn get-summary-bytes
  "One-line human-readable description of what the Op does.
  string summary = 7;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDefOrBuilder this]
    (-> this (.getSummaryBytes))))

(defn get-arg-order-count
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  returns: `int`"
  (^Integer [^ApiDefOrBuilder this]
    (-> this (.getArgOrderCount))))

(defn get-description-suffix
  "string description_suffix = 10;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDefOrBuilder this]
    (-> this (.getDescriptionSuffix))))

(defn get-out-arg-list
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Arg>`"
  (^java.util.List [^ApiDefOrBuilder this]
    (-> this (.getOutArgList))))

(defn get-in-arg-count
  "repeated .tensorflow.ApiDef.Arg in_arg = 4;

  returns: `int`"
  (^Integer [^ApiDefOrBuilder this]
    (-> this (.getInArgCount))))

(defn get-arg-order-list
  "List of original in_arg names to specify new argument order.
   Length of arg_order should be either empty to keep current order
   or match size of in_arg.
  repeated string arg_order = 11;

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ApiDefOrBuilder this]
    (-> this (.getArgOrderList))))

(defn get-out-arg-or-builder-list
  "repeated .tensorflow.ApiDef.Arg out_arg = 5;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$ArgOrBuilder>`"
  ([^ApiDefOrBuilder this]
    (-> this (.getOutArgOrBuilderList))))

(defn get-attr-or-builder-list
  "repeated .tensorflow.ApiDef.Attr attr = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDef$AttrOrBuilder>`"
  ([^ApiDefOrBuilder this]
    (-> this (.getAttrOrBuilderList))))

