(ns org.nd4j.linalg.api.buffer.util.AllocUtil
  "Used for manipulating the allocation
 variable in nd4j's context"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.buffer.util AllocUtil]))

(defn ->alloc-util
  "Constructor."
  (^AllocUtil []
    (new AllocUtil )))

(defn *get-allocation-mode-from-context
  "Get the allocation mode from the context

  alloc-mode - `java.lang.String`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode [^java.lang.String alloc-mode]
    (AllocUtil/getAllocationModeFromContext alloc-mode))
  (^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode []
    (AllocUtil/getAllocationModeFromContext )))

(defn *get-alloc-mode-name
  "Gets the name of the alocation mode

  allocation-mode - `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode`

  returns: `java.lang.String`"
  (^java.lang.String [^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode allocation-mode]
    (AllocUtil/getAllocModeName allocation-mode)))

(defn *set-allocation-mode-for-context
  "Set the allocation mode for the nd4j context
  The value must be one of: heap, java cpp, or direct
  or an @link{IllegalArgumentException} is thrown

  allocation-mode-for-context - `org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode`"
  ([^org.nd4j.linalg.api.buffer.DataBuffer$AllocationMode allocation-mode-for-context]
    (AllocUtil/setAllocationModeForContext allocation-mode-for-context)))

