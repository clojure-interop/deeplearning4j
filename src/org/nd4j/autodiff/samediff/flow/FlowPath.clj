(ns org.nd4j.autodiff.samediff.flow.FlowPath
  "This class acts as holder for flow control information."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff.flow FlowPath]))

(defn ->flow-path
  "Constructor."
  (^FlowPath []
    (new FlowPath )))

(defn active?
  "This method checks, if specified graph node is active (as in - located within active code branch, and was NOT left in inactive branch)

  node-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FlowPath this ^java.lang.String node-name]
    (-> this (.isActive node-name))))

(defn frame-active?
  "This method returns TRUE if specified frame was activated (as in: Enter/Merge was triggered)

  frame-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FlowPath this ^java.lang.String frame-name]
    (-> this (.isFrameActive frame-name))))

(defn set-active-branch
  "This method sets active/inactive branch for divergent nodes (aka Switch)

  node-name - `java.lang.String`
  branch-idx - `int`"
  ([^FlowPath this ^java.lang.String node-name ^Integer branch-idx]
    (-> this (.setActiveBranch node-name branch-idx))))

(defn forget-frame
  "This method removes specified frame from tracking

  frame-name - `java.lang.String`"
  ([^FlowPath this ^java.lang.String frame-name]
    (-> this (.forgetFrame frame-name))))

(defn set-rewind-position-once
  "This method allows to set position for next rewind within graph.
  PLEASE NOTE: This methods check, if rewind position wasn't set yet. If it was already set for this frame - it'll be no-op method

  frame-name - `java.lang.String`
  position - `int`"
  ([^FlowPath this ^java.lang.String frame-name ^Integer position]
    (-> this (.setRewindPositionOnce frame-name position))))

(defn activate-frame
  "This method triggers frame state

  frame-name - `java.lang.String`
  really-activate - `boolean`"
  ([^FlowPath this ^java.lang.String frame-name ^Boolean really-activate]
    (-> this (.activateFrame frame-name really-activate))))

(defn mark-executed
  "This method allows to toggle wasExecuted() state for specified node

  node-name - `java.lang.String`
  executed - `boolean`"
  ([^FlowPath this ^java.lang.String node-name ^Boolean executed]
    (-> this (.markExecuted node-name executed))))

(defn rewind-possible?
  "frame-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FlowPath this ^java.lang.String frame-name]
    (-> this (.isRewindPossible frame-name))))

(defn get-number-of-cycles
  "This method returns number of iterations of specified node.

  frame-name - `java.lang.String`

  returns: `long`"
  (^Long [^FlowPath this ^java.lang.String frame-name]
    (-> this (.getNumberOfCycles frame-name))))

(defn get-active-branch
  "This method returns active branch of specific node (if any)

  node-name - `java.lang.String`

  returns: `int`"
  (^Integer [^FlowPath this ^java.lang.String node-name]
    (-> this (.getActiveBranch node-name))))

(defn mark-active
  "This method allows to set specified node active or inactive.
  PLEASE NOTE: All nodes using this node as input, will be considered inactive, if this node is set to be inactive.

  node-name - `java.lang.String`
  active - `boolean`"
  ([^FlowPath this ^java.lang.String node-name ^Boolean active]
    (-> this (.markActive node-name active))))

(defn set-rewind-position
  "This method allows to set position for next rewind within graph

  frame-name - `java.lang.String`
  position - `int`"
  ([^FlowPath this ^java.lang.String frame-name ^Integer position]
    (-> this (.setRewindPosition frame-name position))))

(defn ensure-node-state-exists
  "This method checks if NodeState was created for specified graph node

  node-name - `java.lang.String`"
  ([^FlowPath this ^java.lang.String node-name]
    (-> this (.ensureNodeStateExists node-name))))

(defn get-rewind-position
  "This method returns planned position within graph for next rewind.

  frame-name - `java.lang.String`

  returns: `int`"
  (^Integer [^FlowPath this ^java.lang.String frame-name]
    (-> this (.getRewindPosition frame-name))))

(defn register-frame
  "This method adds Frame to tracking
  PLEASE NOTE: Only works for first call, subsequent calls are no-op

  frame-name - `java.lang.String`"
  ([^FlowPath this ^java.lang.String frame-name]
    (-> this (.registerFrame frame-name))))

(defn increment-number-of-cycles
  "This node increments number of iterations by 1.

  frame-name - `java.lang.String`"
  ([^FlowPath this ^java.lang.String frame-name]
    (-> this (.incrementNumberOfCycles frame-name))))

(defn was-executed
  "This method returns TRUE if specified node was already executed during current pass, FALSE otherwise

  node-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FlowPath this ^java.lang.String node-name]
    (-> this (.wasExecuted node-name))))

(defn rewind-planned?
  "This method checks, if rewind was planned for specified frame_name

  frame-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FlowPath this ^java.lang.String frame-name]
    (-> this (.isRewindPlanned frame-name))))

(defn registered-frame?
  "This method returns TRUE if frame_name already registered, false otherwise

  frame-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FlowPath this ^java.lang.String frame-name]
    (-> this (.isRegisteredFrame frame-name))))

(defn plan-rewind
  "This method announces future rewind of graph execution to specified position

  frame-name - `java.lang.String`
  really-plan - `boolean`"
  ([^FlowPath this ^java.lang.String frame-name ^Boolean really-plan]
    (-> this (.planRewind frame-name really-plan))))

