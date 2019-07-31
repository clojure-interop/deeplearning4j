(ns org.nd4j.jita.flow.impl.AsynchronousFlowController
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.flow.impl AsynchronousFlowController]))

(defn ->asynchronous-flow-controller
  "Constructor.

  Deprecated."
  (^AsynchronousFlowController []
    (new AsynchronousFlowController )))

(defn synchronize-to-host
  "Deprecated.

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^AsynchronousFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.synchronizeToHost point))))

(defn register-action
  "Deprecated.

  context - `org.nd4j.linalg.jcublas.context.CudaContext`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AsynchronousFlowController this ^org.nd4j.linalg.jcublas.context.CudaContext context ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.registerAction context result operands))))

(defn wait-till-released
  "Deprecated.

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^AsynchronousFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.waitTillReleased point))))

(defn wait-till-finished
  "Deprecated.

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^AsynchronousFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.waitTillFinished point))))

(defn prepare-action
  "Deprecated.

  result - `org.nd4j.jita.allocator.impl.AllocationPoint`
  operands - `org.nd4j.jita.allocator.impl.AllocationPoint`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^AsynchronousFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint result ^org.nd4j.jita.allocator.impl.AllocationPoint operands]
    (-> this (.prepareAction result operands))))

(defn init
  "Deprecated.

  allocator - `org.nd4j.jita.allocator.Allocator`"
  ([^AsynchronousFlowController this ^org.nd4j.jita.allocator.Allocator allocator]
    (-> this (.init allocator))))

(defn commit-transfer
  "Deprecated.

  stream-used - `org.nd4j.jita.allocator.pointers.cuda.cudaStream_t`"
  ([^AsynchronousFlowController this ^org.nd4j.jita.allocator.pointers.cuda.cudaStream_t stream-used]
    (-> this (.commitTransfer stream-used))))

(defn prepare-action-all-write
  "Deprecated.

  operands - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^AsynchronousFlowController this ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.prepareActionAllWrite operands))))

(defn synchronize-to-device
  "Deprecated.

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^AsynchronousFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.synchronizeToDevice point))))

(defn register-action-all-write
  "Deprecated.

  context - `org.nd4j.linalg.jcublas.context.CudaContext`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^AsynchronousFlowController this ^org.nd4j.linalg.jcublas.context.CudaContext context ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.registerActionAllWrite context operands))))

