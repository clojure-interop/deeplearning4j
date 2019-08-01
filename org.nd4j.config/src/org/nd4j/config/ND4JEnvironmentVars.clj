(ns org.nd4j.config.ND4JEnvironmentVars
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.config ND4JEnvironmentVars]))

(def *-backend-priority-cpu
  "Static Constant.

  Applicability: nd4j-native, when multiple backends are on classpath
  Description: Defines the priority that the CPU/Native backend should be loaded (or attempt to be loaded). If this
  is set to a higher value than BACKEND_PRIORITY_GPU (which has default value 100) the native backend
  will be loaded in preference to the CUDA backend, when both are on the classpath. Default value: 0

  type: java.lang.String"
  ND4JEnvironmentVars/BACKEND_PRIORITY_CPU)

(def *-backend-priority-gpu
  "Static Constant.

  Applicability: nd4j-cuda-xx, when multiple backends are on classpath
  Description: Defines the priority that the CUDA (GPU) backend should be loaded (or attempt to be loaded). If this
  is set to a higher value than BACKEND_PRIORITY_CPU (which has default value 0) the GPU backend
  will be loaded in preference to the CUDA backend, when both are on the classpath. Default value: 100 - hence
  by default, the CUDA backend will be loaded when both it and the CPU/native backend are on the classpath

  type: java.lang.String"
  ND4JEnvironmentVars/BACKEND_PRIORITY_GPU)

(def *-backend-dynamic-load-classpath
  "Static Constant.

  Applicability: always - but only if an ND4J backend cannot be found/loaded via standard ServiceLoader mechanisms
  Description: Set this environment variable to a set fully qualified JAR files to attempt to load before failing on
  not loading a backend. JAR files should be semi-colon delimited; i.e., \"/some/file.jar;/other/path.jar\".
  This should rarely be required in practice - for example, only in dynamic class loading/dynamic classpath scenarios
  For equivalent system property, see ND4JSystemProperties.DYNAMIC_LOAD_CLASSPATH_PROPERTY for the equivalent
  system property (that will take precidence if both are set)

  type: java.lang.String"
  ND4JEnvironmentVars/BACKEND_DYNAMIC_LOAD_CLASSPATH)

(def *-omp-num-threads
  "Static Constant.

  Applicability: nd4j-native backend
  Description: Sets the number of OpenMP parallel threads for ND4J native operations (and also native BLAS libraries
  such as Intel MKL and OpenBLAS).
  By default, this will be set to the number of physical cores (i.e., excluding hyperthreading cores), which usually
  provides optimal performance. Setting this to a larger value than the number of physical cores (for example, equal
  to number of logical cores - i.e., setting to 16 on an 8-core  hypethreading processor) - can result in reduced
  performance
  Note that if you have a significant number of parallel Java threads (for example, Spark or ParallelWrapper), or
  you want to keep some cores free for other programs - you may want to reduce this value.

  type: java.lang.String"
  ND4JEnvironmentVars/OMP_NUM_THREADS)

(def *-nd-4-j-skip-blas-threads
  "Static Constant.

  Applicability: nd4j-native backend
  Description: Skips the setting of the OMP_NUM_THREADS property for ND4J ops. Note that this property
  will usually still take effect for native BLAS libraries (MKL, OpenBLAS) even if this property is set

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_SKIP_BLAS_THREADS)

(def *-nd-4-j-fallback
  "Static Constant.

  Applicability: nd4j-native backend
  Description: Whether build-in BLAS matrix multiplication (GEMM) should be used instead of the native BLAS
  library such as MKL or OpenBLAS. This can have a noticable performance impact for these ops.
  Note that this is typically only useful as a workaround (or test) for bugs in these underlying native libraries,
  which are rare (but do occasionally occur on some platforms)

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_FALLBACK)

(def *-dl-4-j-void-ip
  "Static Constant.

  Applicability: nd4j-parameter-server
  Usage: A fallback for determining the local IP the parameter server, if other approaches fail to determine the
  local IP

  type: java.lang.String"
  ND4JEnvironmentVars/DL4J_VOID_IP)

(def *-nd-4-j-cuda-max-block-size
  "Static Constant.

  Applicability: nd4j-cuda-xx
  Description:

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_CUDA_MAX_BLOCK_SIZE)

(def *-nd-4-j-cuda-min-block-size
  "Static Constant.

  Applicability: nd4j-cuda-xx
  Description:

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_CUDA_MIN_BLOCK_SIZE)

(def *-nd-4-j-cuda-max-grid-size
  "Static Constant.

  Applicability: nd4j-cuda-xx
  Description:

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_CUDA_MAX_GRID_SIZE)

(def *-nd-4-j-cuda-force-single-gpu
  "Static Constant.

  Applicability: nd4j-cuda-xx used on multi-GPU systems
  Description: If set, only a single GPU will be used by ND4J, even if multiple GPUs are available in the system

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_CUDA_FORCE_SINGLE_GPU)

(def *-nd-4-j-cuda-use-preallocation
  "Static Constant.

  Applicability: nd4j-cuda-xx
  Description:

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_CUDA_USE_PREALLOCATION)

(def *-nd-4-j-cuda-max-device-cache
  "Static Constant.

  Applicability: nd4j-cuda-xx
  Description:

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_CUDA_MAX_DEVICE_CACHE)

(def *-nd-4-j-cuda-max-host-cache
  "Static Constant.

  Applicability: nd4j-cuda-xx
  Description:

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_CUDA_MAX_HOST_CACHE)

(def *-nd-4-j-cuda-max-device-allocation
  "Static Constant.

  Applicability: nd4j-cuda-xx
  Description:

  type: java.lang.String"
  ND4JEnvironmentVars/ND4J_CUDA_MAX_DEVICE_ALLOCATION)

