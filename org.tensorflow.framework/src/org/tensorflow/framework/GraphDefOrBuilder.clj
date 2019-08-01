(ns org.tensorflow.framework.GraphDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphDefOrBuilder]))

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
  (^Boolean [^GraphDefOrBuilder this]
    (-> this (.hasLibrary))))

(defn get-versions
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `org.tensorflow.framework.VersionDef`"
  (^org.tensorflow.framework.VersionDef [^GraphDefOrBuilder this]
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
  (^org.tensorflow.framework.FunctionDefLibrary [^GraphDefOrBuilder this]
    (-> this (.getLibrary))))

(defn get-node-count
  "repeated .tensorflow.NodeDef node = 1;

  returns: `int`"
  (^Integer [^GraphDefOrBuilder this]
    (-> this (.getNodeCount))))

(defn get-node
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^GraphDefOrBuilder this ^Integer index]
    (-> this (.getNode index))))

(defn get-node-or-builder
  "repeated .tensorflow.NodeDef node = 1;

  index - `int`

  returns: `org.tensorflow.framework.NodeDefOrBuilder`"
  (^org.tensorflow.framework.NodeDefOrBuilder [^GraphDefOrBuilder this ^Integer index]
    (-> this (.getNodeOrBuilder index))))

(defn get-versions-or-builder
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `org.tensorflow.framework.VersionDefOrBuilder`"
  (^org.tensorflow.framework.VersionDefOrBuilder [^GraphDefOrBuilder this]
    (-> this (.getVersionsOrBuilder))))

(defn get-version
  "Deprecated.

  returns: `int`"
  (^Integer [^GraphDefOrBuilder this]
    (-> this (.getVersion))))

(defn get-node-or-builder-list
  "repeated .tensorflow.NodeDef node = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeDefOrBuilder>`"
  ([^GraphDefOrBuilder this]
    (-> this (.getNodeOrBuilderList))))

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
  (^org.tensorflow.framework.FunctionDefLibraryOrBuilder [^GraphDefOrBuilder this]
    (-> this (.getLibraryOrBuilder))))

(defn has-versions?
  "Compatibility versions of the graph.  See core/public/version.h for version
   history.  The GraphDef version is distinct from the TensorFlow version, and
   each release of TensorFlow will support a range of GraphDef versions.
  .tensorflow.VersionDef versions = 4;

  returns: `boolean`"
  (^Boolean [^GraphDefOrBuilder this]
    (-> this (.hasVersions))))

(defn get-node-list
  "repeated .tensorflow.NodeDef node = 1;

  returns: `java.util.List<org.tensorflow.framework.NodeDef>`"
  (^java.util.List [^GraphDefOrBuilder this]
    (-> this (.getNodeList))))

