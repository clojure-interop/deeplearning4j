(ns org.nd4j.jita.flow.impl.SynchronousFlowController
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.flow.impl SynchronousFlowController]))

(defn ->synchronous-flow-controller
  "Constructor."
  (^SynchronousFlowController []
    (new SynchronousFlowController )))

(defn synchronize-to-host
  "This method makes sure HOST memory contains latest data from GPU

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^SynchronousFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.synchronizeToHost point))))

(defn register-action
  "Description copied from interface: FlowController

  context - `org.nd4j.linalg.jcublas.context.CudaContext`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SynchronousFlowController this ^org.nd4j.linalg.jcublas.context.CudaContext context ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.registerAction context result operands))))

(defn wait-till-released
  "point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^SynchronousFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.waitTillReleased point))))

(defn wait-till-finished
  "Description copied from interface: FlowController

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^SynchronousFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.waitTillFinished point))))

(defn prepare-action
  "Description copied from interface: FlowController

  result - `org.nd4j.linalg.api.ndarray.INDArray`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^SynchronousFlowController this ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.prepareAction result operands))))

(defn init
  "allocator - `org.nd4j.jita.allocator.Allocator`"
  ([^SynchronousFlowController this ^org.nd4j.jita.allocator.Allocator allocator]
    (-> this (.init allocator))))

(defn commit-transfer
  "Description copied from interface: FlowController

  stream-used - `org.nd4j.jita.allocator.pointers.cuda.cudaStream_t`"
  ([^SynchronousFlowController this ^org.nd4j.jita.allocator.pointers.cuda.cudaStream_t stream-used]
    (-> this (.commitTransfer stream-used))))

(defn prepare-action-all-write
  "operands - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^org.nd4j.linalg.jcublas.context.CudaContext [^SynchronousFlowController this ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.prepareActionAllWrite operands))))

(defn synchronize-to-device
  "Description copied from interface: FlowController

  point - `org.nd4j.jita.allocator.impl.AllocationPoint`"
  ([^SynchronousFlowController this ^org.nd4j.jita.allocator.impl.AllocationPoint point]
    (-> this (.synchronizeToDevice point))))

(defn register-action-all-write
  "context - `org.nd4j.linalg.jcublas.context.CudaContext`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SynchronousFlowController this ^org.nd4j.linalg.jcublas.context.CudaContext context ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.registerActionAllWrite context operands))))

