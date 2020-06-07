package com.lxy.metadata.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.suspendAtomicCancellableCoroutine

abstract class BaseFragment<VB : ViewDataBinding> : Fragment(),CoroutineScope by MainScope() {

    protected var mBinding: VB? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (mBinding == null) {
            mBinding = DataBindingUtil.inflate(inflater,getLayoutId(), container, false)
        }
        return mBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding?.lifecycleOwner = this
        initFragment(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        mBinding?.unbind()
    }

    abstract fun getLayoutId(): Int

    abstract fun initFragment(view: View, savedInstanceState: Bundle?)
}