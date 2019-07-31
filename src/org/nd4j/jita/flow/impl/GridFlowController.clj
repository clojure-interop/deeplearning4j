(ns org.nd4j.jita.flow.impl.GridFlowController
  "FlowController implementation suitable for CudaGridExecutioner
 Main difference here, is delayed execution support and forced execution trigger in special cases"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.flow.impl GridFlowController]))

(defn ->grid-flow-controller
  "Constructor."
  (^GridFlowController []
    (new GridFlowController )))

(defn synchronize-to-host
  "This method makes sure HOST memory contains latest data from GPU
  Additionally, this method checks, that there's no ops pending execution for this array

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^GridFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.synchronizeToHost point))))

(defn wait-till-finished
  "Additionally, this method checks, that there's no ops pending execution for this array

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^GridFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.waitTillFinished point))))

(defn wait-till-released
  "Additionally, this method checks, that there's no ops pending execution for this array

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^GridFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.waitTillReleased point))))

