package com.concesionario.ui.concesionario

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.concesionario.R
import com.concesionario.databinding.FragmentConcesionarioBinding
import com.concesionario.viewmodel.ConcesionarioViewModel

class ConcesionarioFragment : Fragment() {

    private lateinit var concesionarioViewModel: ConcesionarioViewModel
    private var _binding: FragmentConcesionarioBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val concesionarioViewModel = ViewModelProvider(this).get(ConcesionarioViewModel::class.java)

        _binding = FragmentConcesionarioBinding.inflate(inflater, container, false)

        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_nav_concesionario_to_addConcesionarioFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}