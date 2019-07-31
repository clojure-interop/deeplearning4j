(ns org.nd4j.linalg.cpu.nativecpu.CpuAffinityManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu CpuAffinityManager]))

(defn ->cpu-affinity-manager
  "Constructor."
  (^CpuAffinityManager []
    (new CpuAffinityManager )))

(defn touch
  "Utility method, to associate INDArray with specific device (backend-specific)
  Has no effect on CPU backend.

  array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CpuAffinityManager this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.touch array))))

