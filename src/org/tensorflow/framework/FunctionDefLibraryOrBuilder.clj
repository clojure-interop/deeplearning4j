(ns org.tensorflow.framework.FunctionDefLibraryOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework FunctionDefLibraryOrBuilder]))

(defn get-function-list
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `java.util.List<org.tensorflow.framework.FunctionDef>`"
  (^java.util.List [^FunctionDefLibraryOrBuilder this]
    (-> this (.getFunctionList))))

(defn get-function
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDef`"
  (^org.tensorflow.framework.FunctionDef [^FunctionDefLibraryOrBuilder this ^Integer index]
    (-> this (.getFunction index))))

(defn get-function-or-builder-list
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.FunctionDefOrBuilder>`"
  ([^FunctionDefLibraryOrBuilder this]
    (-> this (.getFunctionOrBuilderList))))

(defn get-function-or-builder
  "repeated .tensorflow.FunctionDef function = 1;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDefOrBuilder`"
  (^org.tensorflow.framework.FunctionDefOrBuilder [^FunctionDefLibraryOrBuilder this ^Integer index]
    (-> this (.getFunctionOrBuilder index))))

(defn get-gradient-count
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `int`"
  (^Integer [^FunctionDefLibraryOrBuilder this]
    (-> this (.getGradientCount))))

(defn get-function-count
  "repeated .tensorflow.FunctionDef function = 1;

  returns: `int`"
  (^Integer [^FunctionDefLibraryOrBuilder this]
    (-> this (.getFunctionCount))))

(defn get-gradient-or-builder-list
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.GradientDefOrBuilder>`"
  ([^FunctionDefLibraryOrBuilder this]
    (-> this (.getGradientOrBuilderList))))

(defn get-gradient
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`

  returns: `org.tensorflow.framework.GradientDef`"
  (^org.tensorflow.framework.GradientDef [^FunctionDefLibraryOrBuilder this ^Integer index]
    (-> this (.getGradient index))))

(defn get-gradient-list
  "repeated .tensorflow.GradientDef gradient = 2;

  returns: `java.util.List<org.tensorflow.framework.GradientDef>`"
  (^java.util.List [^FunctionDefLibraryOrBuilder this]
    (-> this (.getGradientList))))

(defn get-gradient-or-builder
  "repeated .tensorflow.GradientDef gradient = 2;

  index - `int`

  returns: `org.tensorflow.framework.GradientDefOrBuilder`"
  (^org.tensorflow.framework.GradientDefOrBuilder [^FunctionDefLibraryOrBuilder this ^Integer index]
    (-> this (.getGradientOrBuilder index))))

