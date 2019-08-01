(ns org.nd4j.nativeblas.Nd4jCuda$HalfGraphState
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfGraphState]))

(defn ->half-graph-state
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfGraphState [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfGraphState p)))

(defn id
  "returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$HalfGraphState this]
    (-> this (.id))))

(defn register-scope
  "This method adds scope to this state tracker

  scope-id - `int`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfGraphState this ^Integer scope-id]
    (-> this (.registerScope scope-id))))

(defn has-scope
  "This method cheks if scope with given ID exists

  scope-id - - ID of the scope - `int`

  returns: - TRUE if scope exists, FALSE otherwise - `(value="bool")  boolean`"
  ([^Nd4jCuda$HalfGraphState this ^Integer scope-id]
    (-> this (.hasScope scope-id))))

(defn forget-scope
  "This method removes specified scope from this state tracker

  scope-id - `int`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfGraphState this ^Integer scope-id]
    (-> this (.forgetScope scope-id))))

(defn attach-op-to-scope
  "This method adds given op to the end of specified scope

  op-num - `long`
  type - `int`
  inputs - `org.nd4j.nativeblas.Nd4jCuda$ArgumentsList`

  returns: `(value="Nd4jStatus")  int attachOpToScope(int scopeId, @`"
  ([^Nd4jCuda$HalfGraphState this ^Long op-num ^Integer type ^org.nd4j.nativeblas.Nd4jCuda$ArgumentsList inputs]
    (-> this (.attachOpToScope op-num type inputs))))

(defn define-return
  "This method adds return statement to specified scope
  PLEASE NOTE: should be used only in body scopes

  scope-id - `int`
  node-id - `int`
  args - `org.nd4j.nativeblas.Nd4jCuda$ArgumentsList`

  returns: `(value="Nd4jStatus")  int`"
  ([^Nd4jCuda$HalfGraphState this ^Integer scope-id ^Integer node-id ^org.nd4j.nativeblas.Nd4jCuda$ArgumentsList args]
    (-> this (.defineReturn scope-id node-id args))))

(defn variable-space
  "This method returns current variable space of this state holder

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace`"
  (^org.nd4j.nativeblas.Nd4jCuda$HalfVariableSpace [^Nd4jCuda$HalfGraphState this]
    (-> this (.variableSpace))))

