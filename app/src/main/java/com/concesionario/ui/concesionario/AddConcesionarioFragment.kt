package com.concesionario.ui.concesionario

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.concesionario.R
import com.concesionario.databinding.FragmentAddConcesionarioBinding
import com.concesionario.databinding.FragmentConcesionarioBinding
import com.concesionario.model.Concesionario
import com.concesionario.viewmodel.ConcesionarioViewModel

class AddConcesionarioFragment : Fragment() {

    private lateinit var concesionarioViewModel: ConcesionarioViewModel
    private var _binding: FragmentAddConcesionarioBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val concesionarioViewModel = ViewModelProvider(this).get(ConcesionarioViewModel::class.java)

        _binding = FragmentAddConcesionarioBinding.inflate(inflater, container, false)

        binding.btAddCarro.setOnClickListener {
            agregarCarro()
        }

        return binding.root
    }

    private fun agregarCarro() {
        val modelo = binding.etModelo.text.toString()
        if (modelo.isNotEmpty()) {
            val año = binding.etAnnio.text.toString()
            val motor = binding.etMotor.text.toString()
            val marca = binding.etMarca.text.toString()
            val precio = binding.etPrecio.text.toString()
            val cantidadAsientos = binding.etCantidadAsientos.text.toString()
            val tipoCajaCambios = binding.etTipoCajaCambios.text.toString()

            val concesionario = Concesionario(0,modelo,0,marca,motor, 0, 0,tipoCajaCambios, "" )

            concesionarioViewModel.addConcesionario(concesionario)
                Toast.makeText(requireContext(),
                    getString(R.string.msg_concesionario_add),
                    Toast.LENGTH_SHORT
                ).show()
            findNavController().navigate(R.id.action_addConcesionarioFragment_to_nav_concesionario)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}