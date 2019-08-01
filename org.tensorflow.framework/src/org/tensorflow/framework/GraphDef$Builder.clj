(ns org.tensorflow.framework.GraphDef$Builder
  " Represents the graph of operations
 Protobuf type tensorflow.GraphDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphDef$Builder/getDescriptor )))

(defn set-version
  "Deprecated.

  value - `int`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^Integer value]
    (-> this (.setVersion value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

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
  (^Boolean [^GraphDef$Builder this]
    (-> this (.hasLibrary))))

(defn add-all-node
  "repeated .tensorflow.NodeDef node = 1;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllNode values))))

(defn build-partial
  "returns: `org.tensorflow.framework.GraphDef`"
  (^org.tensorflow.framework.GraphDef [^GraphDef$Builder this]
    (-> this (.buildPartial))))

(defn get-versions-builder
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^GraphDef$Builder this]
    (-> this (.getVersionsBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphDef$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphDef`"
  (^org.tensorflow.framework.GraphDef [^GraphDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-versions
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `org.tensorflow.framework.VersionDef`"
  (^org.tensorflow.framework.VersionDef [^GraphDef$Builder this]
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
  (^org.tensorflow.framework.FunctionDefLibrary [^GraphDef$Builder this]
    (-> this (.getLibrary))))

(defn get-node-count
  "repeated .tensorflow.NodeDef node = 1;

  returns: `int`"
  (^Integer [^GraphDef$Builder this]
    (-> this (.getNodeCount))))

(defn add-node
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`
  value - `org.tensorflow.framework.NodeDef`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^Integer index ^org.tensorflow.framework.NodeDef value]
    (-> this (.addNode index value)))
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^org.tensorflow.framework.NodeDef value]
    (-> this (.addNode value))))

(defn set-versions
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  value - `org.tensorflow.framework.VersionDef`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^org.tensorflow.framework.VersionDef value]
    (-> this (.setVersions value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-node-builder
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^GraphDef$Builder this ^Integer index]
    (-> this (.getNodeBuilder index))))

(defn merge-library
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

  value - `org.tensorflow.framework.FunctionDefLibrary`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^org.tensorflow.framework.FunctionDefLibrary value]
    (-> this (.mergeLibrary value))))

(defn set-node
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`
  value - `org.tensorflow.framework.NodeDef`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^Integer index ^org.tensorflow.framework.NodeDef value]
    (-> this (.setNode index value))))

(defn get-node
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^GraphDef$Builder this ^Integer index]
    (-> this (.getNode index))))

(defn get-node-or-builder
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`

  returns: `org.tensorflow.framework.NodeDefOrBuilder`"
  (^org.tensorflow.framework.NodeDefOrBuilder [^GraphDef$Builder this ^Integer index]
    (-> this (.getNodeOrBuilder index))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-versions-or-builder
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `org.tensorflow.framework.VersionDefOrBuilder`"
  (^org.tensorflow.framework.VersionDefOrBuilder [^GraphDef$Builder this]
    (-> this (.getVersionsOrBuilder))))

(defn clear-version
  "Deprecated.

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this]
    (-> this (.clearVersion))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn remove-node
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^Integer index]
    (-> this (.removeNode index))))

(defn get-version
  "Deprecated.

  returns: `int`"
  (^Integer [^GraphDef$Builder this]
    (-> this (.getVersion))))

(defn build
  "returns: `org.tensorflow.framework.GraphDef`"
  (^org.tensorflow.framework.GraphDef [^GraphDef$Builder this]
    (-> this (.build))))

(defn clear-node
  "repeated .tensorflow.NodeDef node = 1;

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this]
    (-> this (.clearNode))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn merge-versions
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  value - `org.tensorflow.framework.VersionDef`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^org.tensorflow.framework.VersionDef value]
    (-> this (.mergeVersions value))))

(defn get-node-or-builder-list
  "repeated .tensorflow.NodeDef node = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeDefOrBuilder>`"
  ([^GraphDef$Builder this]
    (-> this (.getNodeOrBuilderList))))

(defn clear-library
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

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this]
    (-> this (.clearLibrary))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^GraphDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-versions
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this]
    (-> this (.clearVersions))))

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
  (^org.tensorflow.framework.FunctionDefLibraryOrBuilder [^GraphDef$Builder this]
    (-> this (.getLibraryOrBuilder))))

(defn clear
  "returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this]
    (-> this (.clear))))

(defn has-versions?
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `boolean`"
  (^Boolean [^GraphDef$Builder this]
    (-> this (.hasVersions))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-node-builder-list
  "repeated .tensorflow.NodeDef node = 1;

  returns: `java.util.List<org.tensorflow.framework.NodeDef$Builder>`"
  (^java.util.List [^GraphDef$Builder this]
    (-> this (.getNodeBuilderList))))

(defn set-library
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

  value - `org.tensorflow.framework.FunctionDefLibrary`

  returns: `org.tensorflow.framework.GraphDef$Builder`"
  (^org.tensorflow.framework.GraphDef$Builder [^GraphDef$Builder this ^org.tensorflow.framework.FunctionDefLibrary value]
    (-> this (.setLibrary value))))

(defn add-node-builder
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^GraphDef$Builder this ^Integer index]
    (-> this (.addNodeBuilder index)))
  (^org.tensorflow.framework.NodeDef$Builder [^GraphDef$Builder this]
    (-> this (.addNodeBuilder))))

(defn get-node-list
  "repeated .tensorflow.NodeDef node = 1;

  returns: `java.util.List<org.tensorflow.framework.NodeDef>`"
  (^java.util.List [^GraphDef$Builder this]
    (-> this (.getNodeList))))

(defn get-library-builder
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

  returns: `org.tensorflow.framework.FunctionDefLibrary$Builder`"
  (^org.tensorflow.framework.FunctionDefLibrary$Builder [^GraphDef$Builder this]
    (-> this (.getLibraryBuilder))))

