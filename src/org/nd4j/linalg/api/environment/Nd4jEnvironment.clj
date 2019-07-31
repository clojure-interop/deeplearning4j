(ns org.nd4j.linalg.api.environment.Nd4jEnvironment
  "An environment descriptor
 representing the state of
 the system nd4j is running.
 The fields here include:
 cpu ram
 number of cpu cores
 number of gpus
 the amount of total ram for each gpu this backend is using
 (indexed by device ordering, you can usually see this from nvidia-smi)
 the blas vendor (typically openblas or cublas)
 the number of max threads for blas
 the number of open mp threads being used"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.environment Nd4jEnvironment]))

(defn ->nd-4j-environment
  "Constructor."
  (^Nd4jEnvironment []
    (new Nd4jEnvironment )))

(def *-memory-bandwidth-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/MEMORY_BANDWIDTH_KEY)

(def *-cuda-device-name-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/CUDA_DEVICE_NAME_KEY)

(def *-cuda-free-memory-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/CUDA_FREE_MEMORY_KEY)

(def *-cuda-total-memory-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/CUDA_TOTAL_MEMORY_KEY)

(def *-cuda-device-major-version-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/CUDA_DEVICE_MAJOR_VERSION_KEY)

(def *-cuda-device-minor-version-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/CUDA_DEVICE_MINOR_VERSION_KEY)

(def *-backend-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/BACKEND_KEY)

(def *-cuda-num-gpus-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/CUDA_NUM_GPUS_KEY)

(def *-cuda-device-information-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/CUDA_DEVICE_INFORMATION_KEY)

(def *-blas-vendor-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/BLAS_VENDOR_KEY)

(def *-os-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/OS_KEY)

(def *-host-free-memory-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/HOST_FREE_MEMORY_KEY)

(def *-host-total-memory-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/HOST_TOTAL_MEMORY_KEY)

(def *-cpu-cores-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/CPU_CORES_KEY)

(def *-omp-threads-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/OMP_THREADS_KEY)

(def *-blas-threads-key
  "Static Constant.

  type: java.lang.String"
  Nd4jEnvironment/BLAS_THREADS_KEY)

(defn *get-environment
  "Load an Nd4jEnvironment from
  the properties returned from OpExecutioner.getEnvironmentInformation()
  derived from Nd4j.getExecutioner()

  returns: the environment representing the system the nd4j
  backend is running on. - `org.nd4j.linalg.api.environment.Nd4jEnvironment`"
  (^org.nd4j.linalg.api.environment.Nd4jEnvironment []
    (Nd4jEnvironment/getEnvironment )))

