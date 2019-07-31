(ns org.tensorflow.framework.GraphDef
  " Represents the graph of operations
 Protobuf type tensorflow.GraphDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphDef]))

(def *-node-field-number
  "Static Constant.

  type: int"
  GraphDef/NODE_FIELD_NUMBER)

(def *-versions-field-number
  "Static Constant.

  type: int"
  GraphDef/VERSIONS_FIELD_NUMBER)

(def *-version-field-number
  "Static Constant.

  type: int"
  GraphDef/VERSION_FIELD_NUMBER)

(def *-library-field-number
  "Static Constant.

  type: int"
  GraphDef/LIBRARY_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GraphDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.GraphDef [^java.nio.ByteBuffer data]
    (GraphDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GraphDef [^java.io.InputStream input]
    (GraphDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GraphDef`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^org.tensorflow.framework.GraphDef prototype]
    (GraphDef/newBuilder prototype))
  (^org.tensorflow.framework.GraphDef$Builder []
    (GraphDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GraphDef`"
  (^org.tensorflow.framework.GraphDef []
    (GraphDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphDef>`"
  (^com.github.os72.protobuf351.Parser []
    (GraphDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GraphDef this]
    (-> this (.getUnknownFields))))

(defn has-library?
  "EXPERIMENTAL. DO NOT USE OR DEPEND ON THIS YET.
   \"library\" provides user-defined functions.
   Naming:
     * library.function.name are in a flat namespace.
       NOTE: We may need to change it to be hierarchical to support
       different orgs. E.g.,
       { \"/google/nn\", { ... }},
       { \"/google/vision\", { ... }}
       { \"/org_foo/module_bar\", { ... }}
       map<string, FunctionDefLib> named_lib;
     * If node[i].op is the name of one function in \"library\",
       node[i] is deemed as a function call. Otherwise, node[i].op
       must be a primitive operation supported by the runtime.
   Function call semantics:
     * The callee may start execution as soon as some of its inputs
       are ready. The caller may want to use Tuple() mechanism to
       ensure all inputs are ready in the same time.
     * The consumer of return values may start executing as soon as
       the return values the consumer depends on are ready.  The
       consumer may want to use Tuple() mechanism to ensure the
       consumer does not start until all return values of the callee
       function are ready.
  .tensorflow.FunctionDefLibrary library = 2;

  returns: `boolean`"
  (^Boolean [^GraphDef this]
    (-> this (.hasLibrary))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphDef this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphDef`"
  (^org.tensorflow.framework.GraphDef [^GraphDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-versions
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `org.tensorflow.framework.VersionDef`"
  (^org.tensorflow.framework.VersionDef [^GraphDef this]
    (-> this (.getVersions))))

(defn get-library
  "EXPERIMENTAL. DO NOT USE OR DEPEND ON THIS YET.
   \"library\" provides user-defined functions.
   Naming:
     * library.function.name are in a flat namespace.
       NOTE: We may need to change it to be hierarchical to support
       different orgs. E.g.,
       { \"/google/nn\", { ... }},
       { \"/google/vision\", { ... }}
       { \"/org_foo/module_bar\", { ... }}
       map<string, FunctionDefLib> named_lib;
     * If node[i].op is the name of one function in \"library\",
       node[i] is deemed as a function call. Otherwise, node[i].op
       must be a primitive operation supported by the runtime.
   Function call semantics:
     * The callee may start execution as soon as some of its inputs
       are ready. The caller may want to use Tuple() mechanism to
       ensure all inputs are ready in the same time.
     * The consumer of return values may start executing as soon as
       the return values the consumer depends on are ready.  The
       consumer may want to use Tuple() mechanism to ensure the
       consumer does not start until all return values of the callee
       function are ready.
  .tensorflow.FunctionDefLibrary library = 2;

  returns: `org.tensorflow.framework.FunctionDefLibrary`"
  (^org.tensorflow.framework.FunctionDefLibrary [^GraphDef this]
    (-> this (.getLibrary))))

(defn get-node-count
  "repeated .tensorflow.NodeDef node = 1;

  returns: `int`"
  (^Integer [^GraphDef this]
    (-> this (.getNodeCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GraphDef this]
    (-> this (.getSerializedSize))))

(defn get-node
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^GraphDef this ^Integer index]
    (-> this (.getNode index))))

(defn get-node-or-builder
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`

  returns: `org.tensorflow.framework.NodeDefOrBuilder`"
  (^org.tensorflow.framework.NodeDefOrBuilder [^GraphDef this ^Integer index]
    (-> this (.getNodeOrBuilder index))))

(defn get-versions-or-builder
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `org.tensorflow.framework.VersionDefOrBuilder`"
  (^org.tensorflow.framework.VersionDefOrBuilder [^GraphDef this]
    (-> this (.getVersionsOrBuilder))))

(defn get-version
  "Deprecated.

  returns: `int`"
  (^Integer [^GraphDef this]
    (-> this (.getVersion))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GraphDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-node-or-builder-list
  "repeated .tensorflow.NodeDef node = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeDefOrBuilder>`"
  ([^GraphDef this]
    (-> this (.getNodeOrBuilderList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GraphDef this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphDef>`"
  (^com.github.os72.protobuf351.Parser [^GraphDef this]
    (-> this (.getParserForType))))

(defn get-library-or-builder
  "EXPERIMENTAL. DO NOT USE OR DEPEND ON THIS YET.
   \"library\" provides user-defined functions.
   Naming:
     * library.function.name are in a flat namespace.
       NOTE: We may need to change it to be hierarchical to support
       different orgs. E.g.,
       { \"/google/nn\", { ... }},
       { \"/google/vision\", { ... }}
       { \"/org_foo/module_bar\", { ... }}
       map<string, FunctionDefLib> named_lib;
     * If node[i].op is the name of one function in \"library\",
       node[i] is deemed as a function call. Otherwise, node[i].op
       must be a primitive operation supported by the runtime.
   Function call semantics:
     * The callee may start execution as soon as some of its inputs
       are ready. The caller may want to use Tuple() mechanism to
       ensure all inputs are ready in the same time.
     * The consumer of return values may start executing as soon as
       the return values the consumer depends on are ready.  The
       consumer may want to use Tuple() mechanism to ensure the
       consumer does not start until all return values of the callee
       function are ready.
  .tensorflow.FunctionDefLibrary library = 2;

  returns: `org.tensorflow.framework.FunctionDefLibraryOrBuilder`"
  (^org.tensorflow.framework.FunctionDefLibraryOrBuilder [^GraphDef this]
    (-> this (.getLibraryOrBuilder))))

(defn has-versions?
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `boolean`"
  (^Boolean [^GraphDef this]
    (-> this (.hasVersions))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GraphDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef this]
    (-> this (.newBuilderForType))))

(defn get-node-list
  "repeated .tensorflow.NodeDef node = 1;

  returns: `java.util.List<org.tensorflow.framework.NodeDef>`"
  (^java.util.List [^GraphDef this]
    (-> this (.getNodeList))))

(defn to-builder
  "returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef this]
    (-> this (.toBuilder))))

