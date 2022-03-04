package com.concesionario.ui.concesionario

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.concesionario.databinding.FragmentConcesionarioBinding
import com.concesionario.viewmodel.ConcesionarioViewModel

class ConcesionarioFragment : Fragment() {

    private var _binding: FragmentConcesionarioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val concesionarioViewModel =
            ViewModelProvider(this).get(ConcesionarioViewModel::class.java)

        _binding = FragmentConcesionarioBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}